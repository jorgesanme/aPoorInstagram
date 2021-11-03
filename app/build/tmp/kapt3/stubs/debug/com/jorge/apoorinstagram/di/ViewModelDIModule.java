package com.jorge.apoorinstagram.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/jorge/apoorinstagram/di/ViewModelDIModule;", "Lcom/jorge/apoorinstagram/di/DIBaseModule;", "()V", "builder", "Lkotlin/Function1;", "Lorg/kodein/di/DI$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getBuilder", "()Lkotlin/jvm/functions/Function1;", "DIViewModelFactory", "app_debug"})
public final class ViewModelDIModule extends com.jorge.apoorinstagram.di.DIBaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.jorge.apoorinstagram.di.ViewModelDIModule INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function1<org.kodein.di.DI.Builder, kotlin.Unit> builder = null;
    
    private ViewModelDIModule() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function1<org.kodein.di.DI.Builder, kotlin.Unit> getBuilder() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jorge/apoorinstagram/di/ViewModelDIModule$DIViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "di", "Lorg/kodein/di/DI;", "(Lorg/kodein/di/DI;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class DIViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final org.kodein.di.DI di = null;
        
        public DIViewModelFactory(@org.jetbrains.annotations.NotNull()
        org.kodein.di.DI di) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}