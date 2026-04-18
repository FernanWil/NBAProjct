package com.example.myapplication.Screens

import android.R.attr.padding
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.myapplication.R
import androidx.compose.material3.*
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.TextButton
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.Navigation.TopBar
import kotlinx.coroutines.launch
import androidx.compose.foundation.lazy.items

data class Player(
   val name: String,
   val age: Int,
   val image: Int
)

// 🟢 PANTALLA PRINCIPAL
//@Preview(showBackground = true, showSystemUi = true)

@Composable
fun PlayersScreen() {

   val players = listOf(
      Player("LeBron James", 41, R.drawable.lb),
      Player("Stephen Curry", 36, R.drawable.stp)
   )

   LazyColumn(
      modifier = Modifier
         .fillMaxSize()
         .padding(10.dp),
      verticalArrangement = Arrangement.spacedBy(10.dp)
   ) {

      items(players) { player ->
         PlayerItem(player)
      }
   }
}

@Composable
fun PlayerItem(player: Player) {

   Card(
      modifier = Modifier.fillMaxWidth()
   ) {

      Row(
         modifier = Modifier.padding(10.dp),
         verticalAlignment = Alignment.CenterVertically
      ) {

         Image(
            painter = painterResource(player.image),
            contentDescription = player.name,
            modifier = Modifier.size(80.dp)
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
         }
      }
   }

}