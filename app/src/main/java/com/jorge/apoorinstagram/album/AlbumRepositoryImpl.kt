package com.jorge.apoorinstagram.album

import com.jorge.apoorinstagram.gallery.Image
import com.jorge.apoorinstagram.network.ImgurApi
import com.jorge.apoorinstagram.network.NetworkGallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AlbumRepositoryImpl(private val imgurApi: ImgurApi): AlbumRepository {
    override suspend fun getAlbum(): Album =
        withContext(Dispatchers.IO){
            imgurApi.getAlbum().toDomain()
        }

    private fun NetworkGallery.toDomain(): Album {
        /** haciendo un filter*/
        val images = data.filter { image ->
            val imageLink = image.images?.first()?.link ?: image.link
            imageLink.contains(".jpg") || imageLink.contains(".png")
        }?.mapNotNull { image ->
            val imageCount = image.images?.size ?: 0
            val album = image.images
            val imageLink = image.images?.first()?.link ?: image.link
            Image(
                id = image.id,
                title = image.title,
                url = imageLink,
                likes = image.favorite_count ?: 0,
                datetime = image.datetime,
                author = image.account_url,
                imageCount = imageCount,
                album = album
            )
        }
        return Album(images)

    }
}