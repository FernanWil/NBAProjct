package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Data.players

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Player(navController: NavController, playerId: String?) {
    val player = players.find { it.id == playerId }
    if (player == null) {
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
            Image(
                painter = painterResource(player.img),
                contentDescription = "${player.name}",
                modifier = Modifier.size(width = 400.dp, height = 225.dp)
            )
            Text(
                text = "${player.name}",
                modifier = Modifier.padding(10.dp)
            )
        }

        item {
            Text(
                text = "${player.description}",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp))

        }

        item {
            Text( text = "Hitos y Logros Clave (A Abril de 2026):",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
        items(player.goals){ goal ->
            Text( text = "${goal.title}",
                fontSize = 25.sp,
                modifier = Modifier.padding(2.dp),
                fontWeight = FontWeight.Bold
            )
            Text( text = "${goal.description}",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
        item {
            Row() {
                Button(onClick = {navController.popBackStack()}) {
                    Text(text = "Regresar")
                }

                Button(onClick = {navController.navigate("media/${playerId}")}) {
                    Text(text = "Ver multimedia ")
                }
            }
        }
    }
}