package com.jorge.apoorinstagram.gallery

import com.jorge.apoorinstagram.network.NetworkGallery

data class Gallery(val images: List<Image>)

data class Image(
    val id: String,
    val title: String?,
    val url: String,
    val likes: Int,
    val datetime: Long,
    val author: String?,
    val imageCount: Int,
    val album: List<NetworkGallery.NetworkImage>?

){
    val authorAvatar: String by lazy  {
         "https://imgur.com/user/${author}/avatar"
    }

}

