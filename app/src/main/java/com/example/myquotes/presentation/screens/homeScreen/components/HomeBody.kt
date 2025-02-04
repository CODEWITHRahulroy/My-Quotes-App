package com.example.myquotes.presentation.screens.homeScreen.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeBody() {
LazyColumn (
    modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)

) {
    item {
        HeadingTitle(title = "Random Quotes")
        RandomQuotesItem()
    }
    item{
       HeadingTitle(title = "Quotes")
    }
    items(10){
        QuoteItem()
    }
}
}

@Preview
@Composable
private fun HomeBodyPreview() {
    HomeBody()
}