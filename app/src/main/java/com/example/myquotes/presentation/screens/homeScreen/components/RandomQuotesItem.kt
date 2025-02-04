package com.example.myquotes.presentation.screens.homeScreen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RandomQuotesItem() {
    QuoteItem(
        color = Color.Red,
        textColor  = Color.White,
    )

}
@Preview(showBackground = true)
@Composable
fun RandomQuotesItemPreview()  {
    RandomQuotesItem( )
}