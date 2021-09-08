package com.jorge.apoorinstagram.di

import com.jorge.apoorinstagram.session.SessionLocalDataSource
import com.jorge.apoorinstagram.session.SessionMemoryDataSource
import com.jorge.apoorinstagram.session.SessionRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

object SessionDIModule: DIBaseModule("SessionDIModule") {
    override val builder: DI.Builder.() -> Unit = {
        bind<SessionLocalDataSource>() with singleton {
            SessionLocalDataSource(instance())
        }
        bind<SessionMemoryDataSource>() with singleton {
            SessionMemoryDataSource()
        }
        bind<SessionRepositoryImpl>() with singleton {
            SessionRepositoryImpl(instance(), instance())
        }
    }
}