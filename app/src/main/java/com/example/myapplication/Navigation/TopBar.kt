package com.example.myapplication.Navigation

import android.R
import android.graphics.drawable.Icon
import android.text.style.IconMarginSpan
import androidx.compose.foundation.Image
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(onMenuClick: () -> Unit){
    TopAppBar(
        title = {
            Text(text = "NBA FANS")
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF1D428A)),
        navigationIcon = {
            IconButton(onClick = onMenuClick) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "drawer")
            }
        }
    )
}