package com.example.myapplication.Screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.Data.News

@Composable
fun NoticesNBA(news: List<News>){
    val context = LocalContext.current
    Text("Todo lo nuevo dentro de la NBA", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 25.dp)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(news){ new ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clickable {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(new.url))
                        context.startActivity(intent)
                    },
                elevation = CardDefaults.cardElevation(6.dp)
            ) {
                Column {

                    AsyncImage(
                        model = new.imageUrl,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                    )

                    Column(modifier = Modifier.padding(10.dp)) {
                        Text(new.title, style = MaterialTheme.typography.titleMedium)
                        Text(new.description, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}