package com.jorge.apoorinstabram

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class GalleryViewModel : ViewModel() {

    /** se crea un liveData para el adapter*/
    val state: MutableLiveData<GalleryState> = MutableLiveData()

    /** se crea una variable de la api okhttpcliente*/
    private val api: ImgurApi

    /** se crean job*/
    private var requestJob: Job? = null

    /** inicializar el oKhttpClient */
    init {
        val cliente = OkHttpClient().newBuilder().build()
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.imgur.com/3/")
            .client(cliente)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
        api = retrofit.create(ImgurApi::class.java)
    }

    fun getHotImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(Dispatchers.IO) {
            val gallery = api.getHotGallery()

            /** haciendo un filter*/
            val images = gallery?.data?.mapNotNull { image ->
                image.images?.first()?.link
            }?.filter {
                it.contains(".jpg") ||
                        it.contains(".png")
            }?.map {
                Image(it)
            }
            state.postValue(GalleryState(images))
        }
    }

    fun getTopImages() {
        /**Creando el RetroFit **/
        /** en una corroutine del viewModel*/
        requestJob?.cancel()
        requestJob = viewModelScope.launch(Dispatchers.IO) {
            val gallery = api.getTopGallery()

            /** haciendo un filter*/
            val images = gallery?.data?.mapNotNull { image ->
                image.images?.first()?.link
            }?.filter {
                it.contains(".jpg") ||
                        it.contains(".png")
            }?.map {
                Image(it)
            }
            state.postValue(GalleryState(images))
        }
    }

    data class GalleryState(val images: List<Image>?)
}