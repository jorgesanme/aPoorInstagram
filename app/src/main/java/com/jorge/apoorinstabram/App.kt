package com.jorge.apoorinstabram

import android.app.Application
import com.jorge.apoorinstabram.di.AppDIModule
import com.jorge.apoorinstabram.di.NetworkDIModule
import com.jorge.apoorinstabram.di.SessionDIModule
import com.jorge.apoorinstabram.di.ViewModelDIModule
import org.kodein.di.DI
import org.kodein.di.DIAware
import timber.log.Timber

class App : Application(), DIAware {

    override val di: DI by DI.lazy {

        import(AppDIModule(application = this@App).create())
        import(NetworkDIModule.create())
        import(ViewModelDIModule.create())
        import(SessionDIModule.create())
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

}