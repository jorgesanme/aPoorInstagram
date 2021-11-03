package com.jorge.apoorinstagram.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/jorge/apoorinstagram/network/ImgurApi;", "", "getAlbum", "Lcom/jorge/apoorinstagram/network/NetworkGallery;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotGallery", "getMyGallery", "getTopGallery", "app_debug"})
public abstract interface ImgurApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "gallery/hot")
    @retrofit2.http.Headers(value = {"Authorization: Client-ID 3795c60af5383c1"})
    public abstract java.lang.Object getHotGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.network.NetworkGallery> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "gallery/top")
    @retrofit2.http.Headers(value = {"Authorization: Client-ID 3795c60af5383c1"})
    public abstract java.lang.Object getTopGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.network.NetworkGallery> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "account/me/images")
    public abstract java.lang.Object getMyGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.network.NetworkGallery> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "album/id")
    @retrofit2.http.Headers(value = {"Authorization: Client-ID 3795c60af5383c1"})
    public abstract java.lang.Object getAlbum(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.network.NetworkGallery> p0);
}