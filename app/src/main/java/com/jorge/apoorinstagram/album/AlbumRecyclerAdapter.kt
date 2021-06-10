package com.jorge.apoorinstagram.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jorge.apoorinstagram.databinding.AlbumItemBinding
import com.jorge.apoorinstagram.gallery.Image

class AlbumRecyclerAdapter : RecyclerView.Adapter<AlbumViewHolder>() {

    var imagesList: List<String> = emptyList()
        /** una vez que se cambia la lista se
         *  debe notivicar al RecyclerView*/
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder =
        AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            .run {
                AlbumViewHolder(this)
            }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val image = imagesList[position]
        holder.bind(image)
    }

    override fun getItemCount(): Int = imagesList.size

}

data class AlbumViewHolder(val binding: AlbumItemBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: String) {
        with(binding) {
            imageView.setImageDrawable(null)
            Glide.with(root)
                .load(image)
                .into(imageView)
        }
    }
}