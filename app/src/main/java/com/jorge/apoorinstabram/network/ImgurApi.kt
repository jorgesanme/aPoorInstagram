package com.jorge.apoorinstabram.network



import com.jorge.apoorinstabram.network.Gallery
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImgurApi {

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/hot")
    suspend fun getHotGallery(): Gallery

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/top")
    suspend fun getTopGallery(): Gallery

    @GET ("account/me/images")
    suspend fun getMeGallery(): Gallery
}