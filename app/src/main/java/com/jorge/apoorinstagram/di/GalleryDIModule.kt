package com.jorge.apoorinstagram.di

import com.jorge.apoorinstagram.gallery.GalleryRepository
import com.jorge.apoorinstagram.gallery.GalleryRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

object GalleryDIModule: DIBaseModule("GalleryDIModule") {
    override val builder: DI.Builder.() -> Unit = {
        bind<GalleryRepository>() with singleton {
            GalleryRepositoryImpl(instance())
        }
    }

}