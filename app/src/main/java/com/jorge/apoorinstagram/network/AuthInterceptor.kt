package com.jorge.apoorinstagram.network

import com.jorge.apoorinstagram.session.SessionLocalDataSource
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private val sessionLocalDataSource: SessionLocalDataSource) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val accessToken = sessionLocalDataSource
            .retrieveSession()
            ?.accesToken
        return if (accessToken == null){
            chain.proceed(request)
        }else {
            chain.proceed(request.newBuilder()
                .addHeader("Authorization", "Bearer $accessToken")
                .build()
            )
        }
    }
}