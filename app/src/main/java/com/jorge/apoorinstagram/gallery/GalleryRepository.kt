package com.jorge.apoorinstagram.gallery

interface GalleryRepository {
    suspend fun getHotGallery(): Gallery
    suspend fun getTopGallery(): Gallery
    suspend fun getMyGallery(): Gallery

}