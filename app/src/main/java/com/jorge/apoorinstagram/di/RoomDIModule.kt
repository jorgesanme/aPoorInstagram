package com.jorge.apoorinstagram.di

import androidx.room.Room
import com.jorge.apoorinstagram.room.AppDataBase
import com.jorge.apoorinstagram.room.ImageDAO
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

object RoomDIModule: DIBaseModule("RoomDIModule") {
    override val builder: DI.Builder.() -> Unit = {
        bind<AppDataBase>() with singleton {
            Room.databaseBuilder(instance(),AppDataBase::class.java, "JSMData").build()
        }
        bind<ImageDAO>() with singleton {
            instance<AppDataBase>().imageDao()
        }
    }

}