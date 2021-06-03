package com.jorge.apoorinstabram

import android.content.Intent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jorge.apoorinstabram.network.Gallery
import com.jorge.apoorinstabram.network.ImgurApi
import com.jorge.apoorinstabram.session.Session
import com.jorge.apoorinstabram.session.SessionLocalDataSource
import com.jorge.apoorinstabram.session.SessionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class GalleryViewModel(
    private val api: ImgurApi,
    private val sessionRepository: SessionRepository,
) : ViewModel() {

    /** se crea un liveData para el adapter*/
    private val stateMLD: MutableLiveData<GalleryState> = MutableLiveData()

    /** para no exponer el mutableLiveData*/
    val state: LiveData<GalleryState>
        get() = stateMLD

    /** Se crea un MutableliveData para la Session*/
    private val sessionMLD: MutableLiveData<SessionState> = MutableLiveData()
    val session: LiveData<SessionState>
        get() = sessionMLD


    /** se crean job*/
    private var requestJob: Job? = null

    init {
        sessionRepository.getSession()?.let { session ->
            sessionMLD.postValue(SessionState(session != null, session?.accountName))
        }
    }


    fun getHotImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(Dispatchers.IO) {
            val gallery = api.getHotGallery()
            parseGallery(gallery)
        }
    }

    fun getTopImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(Dispatchers.IO) {
            val gallery = api.getTopGallery()
            parseGallery(gallery)
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
                    sessionMLD.postValue(
                        SessionState(true, session.accountName)
                    )
                }
        }
    }

    private fun parseGallery(gallery: Gallery) {
        /** haciendo un filter*/
        val images = gallery?.data?.mapNotNull { image ->
            image.images?.first()?.link
        }?.filter {
            it.contains(".jpg") ||
                    it.contains(".png")
        }?.map {
            Image(it)
        }

        stateMLD.postValue(GalleryState(images))
    }

    data class GalleryState(val images: List<Image>?)
    data class SessionState(val hasSession: Boolean, val accountName: String?)
}


