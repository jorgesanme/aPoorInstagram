package com.jorge.apoorinstagram.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u000b\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\f\u0010\u000f\u001a\u00020\b*\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/jorge/apoorinstagram/gallery/GalleryRepositoryImpl;", "Lcom/jorge/apoorinstagram/gallery/GalleryRepository;", "imgurApi", "Lcom/jorge/apoorinstagram/network/ImgurApi;", "imageDAO", "Lcom/jorge/apoorinstagram/room/ImageDAO;", "(Lcom/jorge/apoorinstagram/network/ImgurApi;Lcom/jorge/apoorinstagram/room/ImageDAO;)V", "getHotGallery", "Lcom/jorge/apoorinstagram/gallery/Gallery;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyGallery", "getTopGallery", "toDoamin", "", "Lcom/jorge/apoorinstagram/room/RoomImage;", "toDomain", "Lcom/jorge/apoorinstagram/network/NetworkGallery;", "toRoom", "imageType", "Lcom/jorge/apoorinstagram/room/ImageType;", "app_debug"})
public final class GalleryRepositoryImpl implements com.jorge.apoorinstagram.gallery.GalleryRepository {
    private final com.jorge.apoorinstagram.network.ImgurApi imgurApi = null;
    private final com.jorge.apoorinstagram.room.ImageDAO imageDAO = null;
    
    public GalleryRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.network.ImgurApi imgurApi, @org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.room.ImageDAO imageDAO) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getHotGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMyGallery(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.jorge.apoorinstagram.gallery.Gallery> p0) {
        return null;
    }
    
    private final com.jorge.apoorinstagram.gallery.Gallery toDomain(com.jorge.apoorinstagram.network.NetworkGallery $this$toDomain) {
        return null;
    }
    
    private final com.jorge.apoorinstagram.gallery.Gallery toDoamin(java.util.List<com.jorge.apoorinstagram.room.RoomImage> $this$toDoamin) {
        return null;
    }
    
    private final java.util.List<com.jorge.apoorinstagram.room.RoomImage> toRoom(com.jorge.apoorinstagram.gallery.Gallery $this$toRoom, com.jorge.apoorinstagram.room.ImageType imageType) {
        return null;
    }
}