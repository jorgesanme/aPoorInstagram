package com.jorge.apoorinstagram.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities =[RoomImage::class] , version = 2)
@TypeConverters(value = [AppConverters::class])
abstract class AppDataBase: RoomDatabase() {

    abstract fun imageDao(): ImageDAO
}