package com.jorge.apoorinstagram.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\b\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/jorge/apoorinstagram/di/DIBaseModule;", "", "name", "", "(Ljava/lang/String;)V", "builder", "Lkotlin/Function1;", "Lorg/kodein/di/DI$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getBuilder", "()Lkotlin/jvm/functions/Function1;", "getName", "()Ljava/lang/String;", "create", "Lorg/kodein/di/DI$Module;", "app_debug"})
public abstract class DIBaseModule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    public DIBaseModule(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.kodein.di.DI.Module create() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<org.kodein.di.DI.Builder, kotlin.Unit> getBuilder();
}