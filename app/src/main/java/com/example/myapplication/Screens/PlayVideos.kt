package com.example.myapplication.Screens

import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.platform.LocalContext
import com.example.myapplication.Data.VideosPlays


@Composable
fun PlaysVideos(vidList: List<VideosPlays>) {
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 25.dp)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(vidList){ vid ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(vid.url))
                        context.startActivity(intent)
                    },
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Column {

                    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current

                    AndroidView(modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f),factory = { context ->
                        YouTubePlayerView(context).apply {
                            layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)

                            lifecycleOwner.lifecycle.addObserver(this)

                            addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                                override fun onReady(player: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer) {
                                    player.loadVideo(vid.url, 0f)
                                }
                            })
                        }
                    })

                    Column(modifier = Modifier.padding(10.dp)) {
                        Text(vid.title, style = MaterialTheme.typography.titleMedium)
                    }
                }
            }
        }
    }


}