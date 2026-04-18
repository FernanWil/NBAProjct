package com.example.myapplication.Navigation

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.Screens.GalleryAboutPlayers
import com.example.myapplication.Screens.ListPlayer
import com.example.myapplication.Screens.NoticesNBA
import com.example.myapplication.Screens.PlayerItem
import com.example.myapplication.Screens.PlayersScreen
import com.example.myapplication.Screens.PlaysVideos

import kotlinx.coroutines.launch

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SideBar() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    var screen by remember { mutableStateOf("Menu")}

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet{
                Column(modifier = Modifier.padding(5.dp)) {
                    Image( painter = painterResource(R.drawable.nba),
                        contentDescription = "NBA",
                        modifier = Modifier.size(width = 200.dp, height = 100.dp))

                    Text("Menu",modifier = Modifier.clickable {
                        screen = "Menu"
                        scope.launch { drawerState.close() }
                    }.padding(10.dp), fontSize = 30.sp)

                    Text("Jugadores",modifier = Modifier.clickable {
                        screen = "Players"
                        scope.launch { drawerState.close() }
                    }.padding(10.dp), fontSize = 30.sp)

                    Text("Jugadas",modifier = Modifier.clickable {
                        screen = "PlaysVideos"
                        scope.launch { drawerState.close() }
                    }.padding(10.dp), fontSize = 30.sp, )

                    Text("Fotos", modifier = Modifier.clickable {
                        screen = "GalleryAboutPlayers"
                        scope.launch { drawerState.close() }
                    }.padding(10.dp), fontSize = 30.sp)

                    Text("Noticias", modifier = Modifier.clickable {
                        screen = "NoticesNBA"
                        scope.launch { drawerState.close() }
                    }.padding(10.dp), fontSize = 30.sp)
                }
            }
        }

    ) {

        Scaffold(
            topBar = {
                TopBar(
                    onMenuClick = {
                        scope.launch {
                            drawerState.open()
                        }
                    }
                )
            }
        ) { padding ->
            Column(modifier = Modifier.padding(padding)) {
                when (screen) {
                    "Menu" -> {
                        PlayersScreen()
                    }
                    "Players" -> { ListPlayer()}
                    "PlaysVideos" -> {PlaysVideos()}
                    "GalleryAboutPlayers" -> {GalleryAboutPlayers()}
                    "NoticesNBA" -> {NoticesNBA()}
                }
            }
        }
    }
}