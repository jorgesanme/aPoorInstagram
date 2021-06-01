package com.jorge.apoorinstabram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.jorge.apoorinstabram.R.id.*
import com.jorge.apoorinstabram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**MODO CORTO DE ESCRIBIRLO**/ //Devuelve un Unit
        val binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        var view: View = findViewById(menu_hot)
        /** modo largo de escribirlo
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         **/

        /** creando un viewModel sin factoria*/
        val viewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        /** Setear el adapter **/
        val adapter = GalleryRecyclerAdapter()
        binding.galleryRecyclerView.adapter = adapter

        viewModel.getHotImages()
        viewModel.state.observe(this){ state ->
        adapter.imageList = state.images!!

        }


        binding.bottomBar.setOnNavigationItemSelectedListener {  menu ->
            when (menu.itemId) {
                R.id.menu_hot -> viewModel.getHotImages()
                R.id.menu_top -> viewModel.getTopImages()
                R.id.menu_login -> {}
            }
            true
        }



    }
}

