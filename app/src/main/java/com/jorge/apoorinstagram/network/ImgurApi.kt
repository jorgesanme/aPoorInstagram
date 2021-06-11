package com.jorge.apoorinstagram.network



import retrofit2.http.GET
import retrofit2.http.Headers

interface ImgurApi {

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/hot")
    suspend fun getHotGallery(): NetworkGallery

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("gallery/top")
    suspend fun getTopGallery(): NetworkGallery

    @GET ("account/me/images")
    suspend fun getMyGallery(): NetworkGallery

    @Headers (  "Authorization: Client-ID 3795c60af5383c1")
    @GET ("album/id")
    suspend fun getAlbum(): NetworkGallery

}