package com.jorge.apoorinstagram


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jorge.apoorinstagram.album.AlbumActivity
import com.jorge.apoorinstagram.databinding.ActivityAlbumBinding
import com.jorge.apoorinstagram.databinding.GalleryItemBinding
import com.jorge.apoorinstagram.gallery.Image
import com.jorge.apoorinstagram.network.NetworkGallery
import timber.log.Timber
import java.io.Serializable

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
        with(binding){
            titleTextView.text = image.title ?: "No title"
            authorTextView.text = image.author ?: "Unknown"
            imageView.setImageDrawable(null) //clean imageView before re-use
            authorAvatarImageView.setImageDrawable(null) //clean imageView before re-use
            Glide.with(root).load(image.authorAvatar).also {
                it.circleCrop()
            }.into(authorAvatarImageView)
            Glide.with(root).load(image.url).into(imageView)
            if(image.imageCount > 1) toAlbum.visibility = View.VISIBLE
            else
                toAlbum.visibility = View.GONE
        }
        binding.toAlbum.setOnClickListener {
            Timber.tag("jorge").d(image.id)// preparando 1º version

            val context = binding.root.context
            val intent = Intent(context, AlbumActivity::class.java).apply {
                val urlString = image.album?.map { it ->
                    it.link
                }?.joinToString (", ")

                val bundle = Bundle()
                bundle.putString("album", urlString)
                  this.putExtras(bundle)
            }
            context.startActivity(intent)
        }

    }

}