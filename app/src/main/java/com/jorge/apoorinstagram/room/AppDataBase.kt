package com.jorge.apoorinstagram.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[RoomImage::class] , version = 1)
abstract class AppDataBase: RoomDatabase() {

    abstract fun imageDao(): ImageDAO
}