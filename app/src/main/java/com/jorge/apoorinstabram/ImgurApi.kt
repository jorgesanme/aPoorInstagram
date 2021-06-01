package com.jorge.apoorinstabram



import retrofit2.http.GET
import retrofit2.http.Headers

interface ImgurApi {

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/hot")
    suspend fun getHotGallery(): Gallery

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/top")
    suspend fun getTopGallery(): Gallery
}