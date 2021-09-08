package com.jorge.apoorinstagram.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/jorge/apoorinstagram/gallery/GalleryRepository;", "", "getHotGallery", "Lcom/jorge/apoorinstagram/gallery/Gallery;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyGallery", "getTopGallery", "app_debug"})
public abstract interface GalleryRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHotGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTopGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMyGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0);
}