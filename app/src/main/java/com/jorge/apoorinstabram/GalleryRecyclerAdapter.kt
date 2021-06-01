package com.jorge.apoorinstabram

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jorge.apoorinstabram.databinding.GalleryItemBinding
import kotlinx.coroutines.*
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class GalleryRecyclerAdapter : RecyclerView.Adapter<GalleryViewHolder>() {

    /** List of object to show **/
    var imageList: List<Image> = emptyList()
        /** una vez que se cambia la lista se
         *  debe notivicar al RecyclerView*/
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    /** ViewHolder**/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder =
        GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run {
                GalleryViewHolder(this)
            }

    /** Bind - unir - vincular C/U row de la lista a la vista**/
    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        //val image : Image = imageList[position]
        holder.bind(imageList[position])
    }

    /** Cantidad de celdas a crear = longitud de la lista**/
    override fun getItemCount(): Int = imageList.size
}

data class GalleryViewHolder(val binding: GalleryItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: Image) {
        binding.imageView.setImageDrawable(null) //clean imageView before re-use
        Glide.with(binding.root)
            .load(image.url)
            .into(binding.imageView)
    }
}