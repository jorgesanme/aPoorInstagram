package com.jorge.apoorinstagram.room

import androidx.room.TypeConverter

class AppConverters {
    /** Convertir los valores de BBDD a primitivos*/
    @TypeConverter
    fun toImageType(value: String) = ImageType.valueOf(value)

    @TypeConverter
    fun fromImageType(imageType: ImageType) = imageType.name

}