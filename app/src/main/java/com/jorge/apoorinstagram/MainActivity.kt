package com.jorge.apoorinstagram

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.jorge.apoorinstagram.R.id.*
import com.jorge.apoorinstagram.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.di
import org.kodein.di.direct
import org.kodein.di.instance

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

        /**Usando Flow en lugar de livedata */
        lifecycleScope.launchWhenStarted {
            launch {
                viewModel.state.collect { state ->
                    adapter.imageList = state.images!!
                    if (state.hasError) {
                        Snackbar.make(binding.root, "Ha ocurrido un, Error", 2_000).show()
                    }
                }
            }
            launch {
                viewModel.session.collect() { sessionState ->
                    binding.bottomBar.menu.findItem(R.id.menu_login).apply {
                        title = when (sessionState.hasSession) {
                            true -> sessionState.accountName
                            false -> "Login"
                        }
                        isEnabled = sessionState.hasSession
                    }
                    binding.bottomBar.menu.findItem(R.id.menu_me).isVisible =
                        sessionState.hasSession


                }
            }

            binding.bottomBar.setOnNavigationItemSelectedListener { menu ->
                when (menu.itemId) {
                    R.id.menu_hot -> viewModel.getHotImages()
                    R.id.menu_top -> viewModel.getTopImages()
                    R.id.menu_me -> viewModel.getMyImages()
                    R.id.menu_login -> oauth2Flow()
                }
                true
            }
        }
    }

    private fun oauth2Flow() {
        val url =
            "https://api.imgur.com/oauth2/authorize?client_id=b9ecaa31b1e2702&response_type=token"
        Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(url)
        }.also {
            startActivity(it)
        }
    }

}


