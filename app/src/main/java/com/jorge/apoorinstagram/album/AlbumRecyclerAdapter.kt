package com.jorge.apoorinstagram.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jorge.apoorinstagram.databinding.AlbumItemBinding

import com.jorge.apoorinstagram.gallery.Gallery

class AlbumRecyclerAdapter : RecyclerView.Adapter<AlbumViewHolder>() {

    var  imagesList: List<Gallery> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder =
        AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run{
                AlbumViewHolder(this)
            }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val image: Gallery = imagesList[position]
        holder.bind(image)
    }

    override fun getItemCount(): Int = imagesList.size

}

data class AlbumViewHolder(val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root){

    fun bind(image: Gallery){
        with(binding){
            val view = binding.imageView
            Glide.with(root)
                .load("https://i.imgur.com/mALKVHL.jpg")
                .into(view)

        }
    }
}