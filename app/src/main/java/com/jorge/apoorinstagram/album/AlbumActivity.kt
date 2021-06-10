package com.jorge.apoorinstagram.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.jorge.apoorinstagram.GalleryViewModel
import com.jorge.apoorinstagram.databinding.ActivityAlbumBinding
import com.jorge.apoorinstagram.network.NetworkGallery
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.kodein.di.DI
import org.kodein.di.android.di
import org.kodein.di.DIAware
import org.kodein.di.direct
import org.kodein.di.instance

class AlbumActivity : AppCompatActivity(), DIAware {
    override val di: DI by di()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAlbumBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        val albumData= intent.getStringExtra("album")?.split(",")
        val adapter = AlbumRecyclerAdapter()
        binding.albumRecycleView.adapter = adapter
        adapter.imagesList = albumData ?: emptyList()



    }




}