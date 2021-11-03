package com.jorge.apoorinstagram;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/jorge/apoorinstagram/GalleryRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/jorge/apoorinstagram/GalleryViewHolder;", "()V", "value", "", "Lcom/jorge/apoorinstagram/gallery/Image;", "imageList", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class GalleryRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.jorge.apoorinstagram.GalleryViewHolder> {
    
    /**
     * List of object to show
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.jorge.apoorinstagram.gallery.Image> imageList;
    
    public GalleryRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jorge.apoorinstagram.gallery.Image> getImageList() {
        return null;
    }
    
    /**
     * una vez que se cambia la lista se
     * debe notivicar al RecyclerView
     */
    public final void setImageList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jorge.apoorinstagram.gallery.Image> value) {
    }
    
    /**
     * ViewHolder
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jorge.apoorinstagram.GalleryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * Bind - unir - vincular C/U row de la lista a la vista
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.GalleryViewHolder holder, int position) {
    }
    
    /**
     * Cantidad de celdas a crear = longitud de la lista
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}