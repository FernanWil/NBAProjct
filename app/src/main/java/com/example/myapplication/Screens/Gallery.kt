package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GalleryAboutPlayers(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { Text(text = "Imagenes de Lebron James (King)") }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(5.dp),
                ) {
                    Image(
                        painter = painterResource(R.drawable.dunk),
                        contentDescription = "LEBRON JAMES",
                        modifier = Modifier.size(width = 200.dp, height = 200.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.ptsbron),
                        contentDescription = "LEBRON JAMES",
                        modifier = Modifier.size(width = 200.dp, height = 200.dp)
                    )
                }
                Row(modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp),) {
                    Image(
                        painter = painterResource(R.drawable.mosterbron),
                        contentDescription = "LEBRON JAMES",
                        modifier = Modifier.size(width = 200.dp, height = 200.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.descargar),
                        contentDescription = "LEBRON JAMES",
                        modifier = Modifier.size(width = 200.dp, height = 200.dp).padding(15.dp)
                    )
                }
            }

        item {
            Text(text = "Video de Jugadas de Lebron James (King)",  modifier = Modifier.padding(15.dp))
            Image(
                painter = painterResource(R.drawable.ki),
                contentDescription = "LEBRON JAMES",
                modifier = Modifier.size(width = 400.dp, height = 200.dp).padding(30.dp)
            )
        }


    }
}