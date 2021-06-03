package com.jorge.apoorinstabram.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jorge.apoorinstabram.GalleryViewModel
import com.jorge.apoorinstabram.session.SessionRepository
import com.jorge.apoorinstabram.session.SessionRepositoryImpl
import org.kodein.di.*
import org.kodein.type.erased

object ViewModelDIModule : DIBaseModule("ViewModelDIModule") {

    override val builder: DI.Builder.() -> Unit = {
        bind<ViewModelProvider.Factory>() with singleton {
            DIViewModelFactory(di)
        }

        bind<GalleryViewModel>() with singleton {
            GalleryViewModel(instance(), instance()) }

    }

    class DIViewModelFactory(private val di: DI) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return di.direct.Instance(erased(modelClass))
        }

    }

}