package com.jorge.apoorinstagram.room

import androidx.room.*
import com.jorge.apoorinstagram.network.NetworkGallery


@Entity(tableName = "images")
data class RoomImage(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "likes") val likes: Int,
    @ColumnInfo(name = "datetime") val datetime: Long,
    @ColumnInfo(name = "author") val author: String?,
    @ColumnInfo(name = "imageCount") val imageCount: Int,
//    @ColumnInfo(name = "type") val type: ImageType,
//    @TypeConverter()
/** Si reutilizas el modelo de otro y quieres ignorar algun valor o campo*/
   // @Ignore() val otroAlbum: List<NetworkGallery.NetworkImage>?
)

    enum class ImageType{
        HOT,
        TOP,
        MY_IMAGES
    }
