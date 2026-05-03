package com.example.myapplication.Navigation

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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.Screens.GalleryAboutPlayers
import com.example.myapplication.Screens.Player
import com.example.myapplication.Screens.NoticesNBA
import com.example.myapplication.Screens.PlayersScreen
import com.example.myapplication.Screens.PlaysVideos
import kotlinx.coroutines.launch
import androidx.navigation.NavHostController
import com.example.myapplication.R
import com.example.myapplication.Data.newsList
import com.example.myapplication.Data.videosList

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SideBar(navController: NavHostController) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Column(modifier = Modifier.padding(5.dp)) {
                    Image(
                        painter = painterResource(R.drawable.nba),
                        contentDescription = "NBA",
                        modifier = Modifier.size(width = 200.dp, height = 200.dp)
                    )

                    Text("Menu", modifier = Modifier.clickable {
                        navController.navigate("Menu")
                        scope.launch { drawerState.close() }
                    })

                    Text("Jugadas", modifier = Modifier.clickable {
                        navController.navigate("Plays")
                        scope.launch { drawerState.close() }
                    })

                    Text("Noticias", modifier = Modifier.clickable {
                        navController.navigate("NoticesNBA")
                        scope.launch { drawerState.close() }
                    })
                }
            }
        }
    ) {

        Scaffold(
            topBar = {
                TopBar(
                    onMenuClick = {
                        scope.launch { drawerState.open() }
                    }
                )
            }
        ) { padding ->
            NavHost(
                navController = navController,
                startDestination = "Menu",
                modifier = Modifier.padding(padding)
            ) {

                composable("Menu") {
                    PlayersScreen(navController)
                }

                composable("Plays") {
                    PlaysVideos(videosList)
                }

                composable("media/{playerId}") { backStackEntry ->
                    val playerId = backStackEntry.arguments?.getString("playerId")
                    GalleryAboutPlayers(navController , playerId)
                }

                composable("NoticesNBA") {
                    NoticesNBA(newsList)
                }

                composable("player/{playerId}") { backStackEntry ->
                    val playerId = backStackEntry.arguments?.getString("playerId")
                    Player(navController , playerId)
                }
            }
        }
    }
}