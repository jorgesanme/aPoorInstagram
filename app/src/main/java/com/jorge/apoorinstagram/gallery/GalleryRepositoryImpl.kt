package com.jorge.apoorinstagram.gallery


import androidx.room.Room
import com.jorge.apoorinstagram.network.ImgurApi
import com.jorge.apoorinstagram.network.NetworkGallery
import com.jorge.apoorinstagram.room.ImageDAO
import com.jorge.apoorinstagram.room.RoomImage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

class GalleryRepositoryImpl(
    private val imgurApi: ImgurApi,
    private val imageDAO: ImageDAO,
) : GalleryRepository {

    override suspend fun getHotGallery() =
        withContext(Dispatchers.IO) {
            try {
                imgurApi.getHotGallery().toDomain().also {gallery ->
                imageDAO.insertImages(gallery.toRoom())
                }
            } catch (e: Exception) {
                Timber.e(e)
                imageDAO.getImages().toDoamin()
            }
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
        return Gallery(images)

    }

    private fun List<RoomImage>.toDoamin(): Gallery {
        return Gallery(map { roomImage ->
            Image(
                title = roomImage.title,
                id = roomImage.id,
                url = roomImage.url,
                likes = roomImage.likes,
                datetime = roomImage.datetime,
                author = roomImage.author,
                imageCount = roomImage.imageCount,
                album = null
            )
        }
        )
    }

    private fun Gallery.toRoom(): List<RoomImage> =
        images.map { image ->
            RoomImage(
                title = image.title,
                id = image.id,
                url = image.url,
                likes = image.likes,
                datetime = image.datetime,
                author = image.author,
                imageCount = image.imageCount
            )
        }

}