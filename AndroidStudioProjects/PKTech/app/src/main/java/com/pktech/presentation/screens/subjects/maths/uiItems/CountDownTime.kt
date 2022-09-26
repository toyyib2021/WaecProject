package com.pktech.presentation.screens.subjects.maths.uiItems

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Stop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalAnimationApi::class)
@Composable
 fun TopAppBarTextAndTime(
    seconds: String,
    minutes: String,
    hours: String,

) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.weight(7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Mathematics 2012",
                        style = MaterialTheme.typography.body2
                    )
                }

                Row(modifier = Modifier.weight(3f)) {
                    Text(
                        text = hours,
                        style = MaterialTheme.typography.body2
                    )
                    Text(
                        text = ":",
                        style = MaterialTheme.typography.body2
                    )
                    Text(
                        text = minutes,
                        style = MaterialTheme.typography.body2
                    )
                    Text(
                        text = ":",
                        style = MaterialTheme.typography.body2
                    )
                    Text(
                        text = seconds,
                        style = MaterialTheme.typography.body2
                    )

                }
            }



}