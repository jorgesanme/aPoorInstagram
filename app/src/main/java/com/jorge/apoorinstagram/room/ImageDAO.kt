package com.jorge.apoorinstagram.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface ImageDAO {

    @Query("SELECT * FROM images")
    fun getImages(): List<RoomImage>

    @Insert(onConflict = REPLACE)
    fun insertImages(imageList: List<RoomImage>)



}