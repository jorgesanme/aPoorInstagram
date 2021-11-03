package com.jorge.apoorinstagram;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003!\"#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel;", "Landroidx/lifecycle/ViewModel;", "galleryRepository", "Lcom/jorge/apoorinstagram/gallery/GalleryRepository;", "sessionRepository", "Lcom/jorge/apoorinstagram/session/SessionRepository;", "(Lcom/jorge/apoorinstagram/gallery/GalleryRepository;Lcom/jorge/apoorinstagram/session/SessionRepository;)V", "albumFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/jorge/apoorinstagram/GalleryViewModel$AlbumState;", "albums", "Lkotlinx/coroutines/flow/StateFlow;", "getAlbums", "()Lkotlinx/coroutines/flow/StateFlow;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "requestJob", "Lkotlinx/coroutines/Job;", "session", "Lcom/jorge/apoorinstagram/GalleryViewModel$SessionState;", "getSession", "sessionFlow", "state", "Lcom/jorge/apoorinstagram/GalleryViewModel$GalleryState;", "getState", "stateFlow", "getHotImages", "", "getMyImages", "getTopImages", "processIntentData", "intent", "Landroid/content/Intent;", "AlbumState", "GalleryState", "SessionState", "app_debug"})
public final class GalleryViewModel extends androidx.lifecycle.ViewModel {
    private final com.jorge.apoorinstagram.gallery.GalleryRepository galleryRepository = null;
    private final com.jorge.apoorinstagram.session.SessionRepository sessionRepository = null;
    
    /**
     * se crea un Flow para el adapter
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.jorge.apoorinstagram.GalleryViewModel.GalleryState> stateFlow = null;
    
    /**
     * Se crea un MutableliveData para la Session
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.jorge.apoorinstagram.GalleryViewModel.SessionState> sessionFlow = null;
    
    /**
     * experimento para el album
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.jorge.apoorinstagram.GalleryViewModel.AlbumState> albumFlow = null;
    
    /**
     * Manejador de errores con Handler
     */
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    
    /**
     * se crean job
     */
    private kotlinx.coroutines.Job requestJob;
    
    public GalleryViewModel(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.gallery.GalleryRepository galleryRepository, @org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.session.SessionRepository sessionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.jorge.apoorinstagram.GalleryViewModel.GalleryState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.jorge.apoorinstagram.GalleryViewModel.SessionState> getSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.jorge.apoorinstagram.GalleryViewModel.AlbumState> getAlbums() {
        return null;
    }
    
    public final void getHotImages() {
    }
    
    public final void getTopImages() {
    }
    
    public final void getMyImages() {
    }
    
    public final void processIntentData(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$GalleryState;", "", "images", "", "Lcom/jorge/apoorinstagram/gallery/Image;", "hasError", "", "(Ljava/util/List;Z)V", "getHasError", "()Z", "getImages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
    public static final class GalleryState {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.jorge.apoorinstagram.gallery.Image> images = null;
        private final boolean hasError = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.jorge.apoorinstagram.GalleryViewModel.GalleryState.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jorge.apoorinstagram.GalleryViewModel.GalleryState copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.jorge.apoorinstagram.gallery.Image> images, boolean hasError) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GalleryState(@org.jetbrains.annotations.Nullable()
        java.util.List<com.jorge.apoorinstagram.gallery.Image> images, boolean hasError) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.jorge.apoorinstagram.gallery.Image> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.jorge.apoorinstagram.gallery.Image> getImages() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getHasError() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$GalleryState$Companion;", "", "()V", "empty", "Lcom/jorge/apoorinstagram/GalleryViewModel$GalleryState;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jorge.apoorinstagram.GalleryViewModel.GalleryState empty() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$AlbumState;", "", "images", "", "Lcom/jorge/apoorinstagram/album/Album;", "(Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
    public static final class AlbumState {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.jorge.apoorinstagram.album.Album> images = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.jorge.apoorinstagram.GalleryViewModel.AlbumState.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jorge.apoorinstagram.GalleryViewModel.AlbumState copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.jorge.apoorinstagram.album.Album> images) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AlbumState(@org.jetbrains.annotations.Nullable()
        java.util.List<com.jorge.apoorinstagram.album.Album> images) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.jorge.apoorinstagram.album.Album> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.jorge.apoorinstagram.album.Album> getImages() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$AlbumState$Companion;", "", "()V", "empty", "Lcom/jorge/apoorinstagram/GalleryViewModel$AlbumState;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jorge.apoorinstagram.GalleryViewModel.AlbumState empty() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$SessionState;", "", "hasSession", "", "accountName", "", "(ZLjava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getHasSession", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_debug"})
    public static final class SessionState {
        private final boolean hasSession = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String accountName = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.jorge.apoorinstagram.GalleryViewModel.SessionState.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.jorge.apoorinstagram.GalleryViewModel.SessionState copy(boolean hasSession, @org.jetbrains.annotations.Nullable()
        java.lang.String accountName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SessionState(boolean hasSession, @org.jetbrains.annotations.Nullable()
        java.lang.String accountName) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getHasSession() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAccountName() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryViewModel$SessionState$Companion;", "", "()V", "empty", "Lcom/jorge/apoorinstagram/GalleryViewModel$SessionState;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.jorge.apoorinstagram.GalleryViewModel.SessionState empty() {
                return null;
            }
        }
    }
}