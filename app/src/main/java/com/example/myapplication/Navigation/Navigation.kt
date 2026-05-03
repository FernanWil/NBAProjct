package com.example.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Screens.Player
import com.example.myapplication.Screens.PlayersScreen

@Composable
fun navigationRoutes(){
    val navController = rememberNavController()
    SideBar(navController)

}