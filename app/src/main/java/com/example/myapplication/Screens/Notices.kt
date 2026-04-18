package com.example.myapplication.Screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NoticesNBA(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 200.dp)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {}
}