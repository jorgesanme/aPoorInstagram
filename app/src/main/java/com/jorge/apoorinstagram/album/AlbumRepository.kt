package com.jorge.apoorinstagram.album

import com.jorge.apoorinstagram.gallery.Gallery


interface AlbumRepository {
    suspend fun getAlbum(): Album
}