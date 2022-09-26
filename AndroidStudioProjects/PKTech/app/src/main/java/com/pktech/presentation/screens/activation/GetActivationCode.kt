package com.pktech.presentation.screens.activation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GetActivationCode(){
    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = 10.dp,
        content = {
            Column(
                modifier = Modifier
                    .height(400.dp)
                    .width(300.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Contact the school management or call 07030857693",
                    style = MaterialTheme.typography.h2,
                )
            }
        }
    )
}