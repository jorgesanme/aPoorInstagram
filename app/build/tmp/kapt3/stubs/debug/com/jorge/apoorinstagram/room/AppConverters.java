package com.jorge.apoorinstagram.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/jorge/apoorinstagram/room/AppConverters;", "", "()V", "fromImageType", "", "imageType", "Lcom/jorge/apoorinstagram/room/ImageType;", "toImageType", "value", "app_debug"})
public final class AppConverters {
    
    public AppConverters() {
        super();
    }
    
    /**
     * Convertir los valores de BBDD a primitivos
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.jorge.apoorinstagram.room.ImageType toImageType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromImageType(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.room.ImageType imageType) {
        return null;
    }
}