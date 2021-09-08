package com.jorge.apoorinstagram.gallery


import com.jorge.apoorinstagram.network.ImgurApi
import com.jorge.apoorinstagram.network.NetworkGallery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GalleryRepositoryImpl(private val imgurApi: ImgurApi) : GalleryRepository {

    override suspend fun getHotGallery() =
        withContext(Dispatchers.IO) {
            imgurApi.getHotGallery().toDomain()
        }


    override suspend fun getTopGallery() =
        withContext(Dispatchers.IO) {
            imgurApi.getTopGallery().toDomain()
        }

    override suspend fun getMyGallery() =
        withContext(Dispatchers.IO) {
            imgurApi.getMyGallery().toDomain()
        }


    private fun NetworkGallery.toDomain(): Gallery {
        /** haciendo un filter*/
        val images = data.filter { image ->
            val imageLink = image.images?.first()?.link ?: image.link
            imageLink.contains(".jpg") || imageLink.contains(".png")
        }?.mapNotNull { image ->
            val imageCount = image.images?.size ?: 0
            val album = image.images
            val imageLink = image.images?.first()?.link ?: image.link
            Image(
                title = image.title,
                url = imageLink,
                likes = image.favorite_count ?: 0,
                datetime = image.datetime,
                author = image.account_url,
                imageCount = imageCount,
                album = album
            )
        }
        return Gallery(images)

    }
}