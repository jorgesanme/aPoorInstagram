package com.jorge.apoorinstagram.album

import com.jorge.apoorinstagram.gallery.Image
import com.jorge.apoorinstagram.network.NetworkGallery

data class Album(val images: List<Image>)

data class Image(
    val id: String,
    val likes: Int,
    val author: String?,
    val album: List<NetworkGallery.NetworkImage>?

){
    val authorAvatar: String by lazy  {
        "https://imgur.com/user/${author}/avatar"
    }

}