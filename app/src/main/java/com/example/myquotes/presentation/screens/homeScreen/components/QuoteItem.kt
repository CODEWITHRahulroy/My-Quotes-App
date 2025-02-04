package com.example.myquotes.presentation.screens.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuoteItem(modifier: Modifier = Modifier,
              color: Color = Color.White,
              textColor: Color = Color.Black) {
    Card (
        modifier = modifier
            .fillMaxWidth()
            .padding( 8.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ){
        Column (modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        )     {
            Text(
                text="The only way to do great work is to love what you do.",
                modifier= Modifier
                    .fillMaxWidth(),
                color=textColor,
                textAlign = TextAlign.Start,
                fontSize=14.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text="Rahul Roy",
                modifier= Modifier
                    .fillMaxWidth(),
                color=textColor,
                textAlign = TextAlign.End,
                fontSize=12.sp,
                fontWeight = FontWeight.W300
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun QuoteItemPreview() {
    QuoteItem()
}