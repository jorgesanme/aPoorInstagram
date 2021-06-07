package com.jorge.apoorinstagram.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jorge.apoorinstagram.databinding.ActivityAlbumBinding
import org.kodein.di.DI
import org.kodein.di.android.di
import org.kodein.di.DIAware

class AlbumActivity : AppCompatActivity(), DIAware {
    override val di: DI by di()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAlbumBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        val adapter = AlbumRecyclerAdapter()
        binding.albumRecycleView.adapter = adapter

        adapter.imagesList = listOf()



    }


}