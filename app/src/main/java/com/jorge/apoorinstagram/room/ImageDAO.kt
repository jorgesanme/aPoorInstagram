package com.jorge.apoorinstagram.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface ImageDAO {

    @Query("SELECT * FROM images WHERE type = 'HOT' ")
    suspend fun getHotImages(): List<RoomImage>

    @Query("SELECT * FROM images WHERE type = 'TOP' ")
    suspend fun getTopImages(): List<RoomImage>

    @Query("SELECT * FROM images WHERE type = 'MY_IMAGES' ")
    suspend fun getMyImages(): List<RoomImage>

    @Insert(onConflict = REPLACE)
    suspend fun insertImages(imageList: List<RoomImage>)

    /** modo simplificado*/

    @Query("SELECT * FROM images WHERE type = :imageType ")
    suspend fun getImages(imageType: ImageType): List<RoomImage>

}