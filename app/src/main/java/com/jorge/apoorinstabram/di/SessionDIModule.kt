package com.jorge.apoorinstabram.di

import com.jorge.apoorinstabram.session.SessionLocalDataSource
import com.jorge.apoorinstabram.session.SessionMemoryDataSource
import com.jorge.apoorinstabram.session.SessionRepository
import com.jorge.apoorinstabram.session.SessionRepositoryImpl
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