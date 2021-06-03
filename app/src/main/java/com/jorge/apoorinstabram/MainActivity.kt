package com.jorge.apoorinstabram

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.jorge.apoorinstabram.R.id.*
import com.jorge.apoorinstabram.databinding.ActivityMainBinding
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.di
import org.kodein.di.direct
import org.kodein.di.instance

import retrofit2.Retrofit

class MainActivity : AppCompatActivity(), DIAware {

    override val di: DI by di()

    /** creando un viewModel*/
    private val viewModel: GalleryViewModel by lazy {
        ViewModelProvider(this, direct.instance())
            .get(GalleryViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** interceptar un intent*/
        viewModel.processIntentData(intent)


        /**MODO CORTO DE ESCRIBIRLO**/ //Devuelve un Unit
        val binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        var view: View = findViewById(menu_hot)

        /** Setear el adapter **/
        val adapter = GalleryRecyclerAdapter()
        binding.galleryRecyclerView.adapter = adapter

        viewModel.getHotImages()
        /** observers */
        viewModel.state.observe(this) { state ->
            adapter.imageList = state.images!!
        }
//        viewModel.session.observe(this) { sessionState ->
//            binding.bottomBar.menu.findItem(R.id.menu_login).apply {
//                title = when (sessionState.hasSession) {
//                    true -> sessionState.accountName
//                    false -> "Login"
//                }
//            }
//        }

        binding.bottomBar.setOnNavigationItemSelectedListener { menu ->
            when (menu.itemId) {
                R.id.menu_hot -> viewModel.getHotImages()
                R.id.menu_top -> viewModel.getTopImages()
                R.id.menu_login -> oauth2Flow()

            }
            true
        }
    }

    private fun oauth2Flow() {
        val url =
            "https://api.imgur.com/oauth2/authorize?client_id=3795c60af5383c1&response_type=token"
        Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(url)
        }.also {
            startActivity(it)
        }
    }

}


