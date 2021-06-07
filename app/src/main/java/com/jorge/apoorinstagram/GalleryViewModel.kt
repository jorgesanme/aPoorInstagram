package com.jorge.apoorinstagram

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jorge.apoorinstagram.gallery.GalleryRepository
import com.jorge.apoorinstagram.gallery.Image
import com.jorge.apoorinstagram.session.Session
import com.jorge.apoorinstagram.session.SessionRepository
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import timber.log.Timber


class GalleryViewModel(
    private val galleryRepository: GalleryRepository,
    private val sessionRepository: SessionRepository,
) : ViewModel() {


    /** se crea un Flow para el adapter*/
    private val stateFlow: MutableStateFlow<GalleryState> = MutableStateFlow(GalleryState.empty())

    /** para no exponer el mutableStateFlow*/
    val state: StateFlow<GalleryState>
        get() = stateFlow

    /** Se crea un MutableliveData para la Session*/
    private val sessionFlow: MutableStateFlow<SessionState> = MutableStateFlow(SessionState.empty())
    val session: StateFlow<SessionState>
        get() = sessionFlow

    /** Manejador de errores con Handler */
    private val handler = CoroutineExceptionHandler { coroutineContext, throwable ->
        Timber.e(throwable)

        stateFlow.value = (GalleryState(emptyList(), true))
    }

    /** se crean job*/
    private var requestJob: Job? = null

    init {
        sessionRepository.getSession()?.let { session ->
            sessionFlow.value =
                (SessionState(session != null, session?.accountName))
        }
    }

    fun getHotImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(handler) {
            val gallery = galleryRepository.getHotGallery()
            stateFlow.value =
                (GalleryState(gallery.images))
        }
    }

    fun getTopImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(handler) {
            val gallery = galleryRepository.getTopGallery()
            stateFlow.value = (GalleryState(gallery.images))
        }
    }

    fun getMyImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(handler) {
            val gallery = galleryRepository.getMyGallery()
            stateFlow.value = (GalleryState(gallery.images))
        }
    }

    fun processIntentData(intent: Intent) {

        val url = intent.data.toString()
        "imgram://oauth2.+".toRegex().matches(url).alsoIfTrue {
            val accesToken = "access_token=(\\w+)".toRegex().find(url)!!.groupValues[1]
            "expires_in=(\\w+)".toRegex()
                .find(url)!!.groupValues[1].toLong() + System.currentTimeMillis()
            "token_type=(\\w+)".toRegex().find(url)!!.groupValues[1]
            "refresh_token=(\\w+)".toRegex().find(url)!!.groupValues[1]
            val accountName = "account_username=(\\w+)".toRegex().find(url)!!.groupValues[1]
            "account_id=(\\w+)".toRegex().find(url)!!.groupValues[1]

            Session(accesToken, accountName)
                .also { session ->
                    sessionRepository.saveSession(session)
                }.also { session ->
                    sessionFlow.value = (
                            SessionState(true, session.accountName)
                            )
                }
        }
    }


    data class GalleryState(val images: List<Image>?, val hasError: Boolean = false) {
        companion object {
            fun empty() = GalleryState(emptyList(), false)
        }
    }

    data class SessionState(val hasSession: Boolean, val accountName: String?) {
        companion object {
            fun empty() = SessionState(false, null)
        }
    }
}


