package com.jorge.apoorinstagram.di

import com.jorge.apoorinstagram.network.AuthInterceptor
import com.jorge.apoorinstagram.network.ImgurApi
import com.jorge.apoorinstagram.network.LoggerInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object NetworkDIModule : DIBaseModule("NetworkDIModule") {

    override val builder: DI.Builder.() -> Unit = {
        /** DI OkHttpCliente*/
        bind<OkHttpClient>() with singleton {
            OkHttpClient().newBuilder()
                .addInterceptor(AuthInterceptor(instance()))
                .addInterceptor(LoggerInterceptor())
                .build()
        }
        /** DI Moshi*/
        bind<Moshi>() with singleton {
            Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        }
        /** DI Retrofit*/
        bind<Retrofit>() with singleton {
            Retrofit.Builder()
                .baseUrl("https://api.imgur.com/3/")
                .client(instance<OkHttpClient>()) //
                .addConverterFactory(MoshiConverterFactory.create(instance<Moshi>()))
                .build()
        }
        bind<ImgurApi>() with singleton {
            instance<Retrofit>().create(ImgurApi::class.java)
        }


    }
}