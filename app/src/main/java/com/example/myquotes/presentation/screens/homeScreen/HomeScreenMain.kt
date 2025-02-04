package com.example.myquotes.presentation.screens.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myquotes.presentation.components.ToolBarComponent
import com.example.myquotes.presentation.screens.homeScreen.components.HomeBody


@Composable
fun HomeScreenMain() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar ={
           ToolBarComponent(title = "Home"){}
        }
    ) { paddingValue ->
        Box(modifier = Modifier.padding(paddingValue)
            .fillMaxSize(),
           contentAlignment =  Alignment.Center) {
           HomeBody()
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreenMain()
}