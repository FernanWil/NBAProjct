package com.example.myapplication.Screens

import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.NavHostController
import com.example.myapplication.Data.multimedia
import com.example.myapplication.Data.players
import com.example.myapplication.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import androidx.compose.foundation.lazy.items

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GalleryAboutPlayers(navController: NavHostController, playerId: String?) {
    val media = multimedia.find { it.id == playerId }
    if (media == null) {
        Text("Jugador no encontrado")
        return
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {
            Text(text = "Imágenes de ${media.name}")
        }

        val imageRows = media.media.img.chunked(2)

        items(imageRows) { rowImages ->

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                rowImages.forEach { img ->
                    Image(
                        painter = painterResource(img),
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .padding(4.dp)
                    )
                }
                if (rowImages.size == 1) {
                    Spacer(modifier = Modifier.size(150.dp))
                }
            }
        }

        item {
            Text(text = "Video de Jugadas de ${media.name}",  modifier = Modifier.padding(15.dp))
            //val videoId = "YOG1KL_rpVQ"
            val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current

            AndroidView(modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f),factory = { context ->
                YouTubePlayerView(context).apply {
                    layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)

                    lifecycleOwner.lifecycle.addObserver(this)

                    addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                        override fun onReady(player: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer) {
                            player.loadVideo(media.media.video, 0f)
                        }
                    })
                }
            })
        }


    }
}