package com.example.myapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import androidx.compose.material3.*
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.Data.PlayerInformation
import com.example.myapplication.Data.players
import android.util.Log

data class Player(
   val id: String,
   val name: String,
   val age: Int,
   val height: String,
   val image: Int,
)

// 🟢 PANTALLA PRINCIPAL
//@Preview(showBackground = true, showSystemUi = true)

@Composable
fun PlayersScreen(navController: NavController) {
   LazyColumn(
      modifier = Modifier
         .fillMaxSize()
         .padding(10.dp),
      verticalArrangement = Arrangement.spacedBy(10.dp)

   ) {
      items(players) { player ->
         PlayerItem(player, navController)
      }
   }
}

@Composable
fun PlayerItem(player: PlayerInformation, navController: NavController) {

   Card(
      modifier = Modifier.fillMaxWidth(),
      onClick = { navController.navigate("player/${player.id}")},
      //onClick = {println("player/${player.id}")}
   ) {
      //Button(onClick = {navController.navigate("player")}) {
         Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
         ) {

            Image(
               painter = painterResource(player.img),
               contentDescription = player.name,
               modifier = Modifier.size(80.dp).clip(RoundedCornerShape(10.dp))
            )

            Column(modifier = Modifier.padding(start = 10.dp)) {

               Text(
                  text = player.name,
                  fontSize = 18.sp
               )

               Text(
                  text = "Edad: ${player.age}",
                  fontSize = 14.sp
               )

               Text(
                  text = "Altura: ${player.height}",
                  fontSize = 14.sp
               )
            }
         }
      }
   //}

}