package com.example.myquotes.presentation.screens.detailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myquotes.presentation.components.ToolBarComponent

@Composable
fun DetailScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
       topBar = {
           ToolBarComponent(
               showBackButton = true,
               title = "Detail",
               onBackPress = {

               }
           )
       }
    ) {
        paddingValue ->
        Box(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ){}
    }
}


@Preview
@Composable
private fun DetailScreenPreview() {
    DetailScreen()
}