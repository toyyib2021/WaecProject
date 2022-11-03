package com.pktech.presentation.screens.subjects.biology.year.bio2012.items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pktech.ui.theme.VeryDarkGray

@Composable
fun BiologyQuestion(
    question: String,
    essay: String,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        when (essay) {
            "" -> {
                Text(
                    text = question,
                    style = MaterialTheme.typography.body2,
                    color = VeryDarkGray
                )
            }
        }


    }
}