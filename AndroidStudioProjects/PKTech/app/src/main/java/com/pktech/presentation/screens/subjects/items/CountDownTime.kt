package com.pktech.presentation.screens.subjects.items

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
import com.pktech.utill.Constants
import com.pktech.utill.Constants.SELECTED_STUDY_KEY

@OptIn(ExperimentalAnimationApi::class)
@Composable
 fun TopAppBarTextAndTime(
    seconds: String,
    minutes: String,
    hours: String,
    secondsStudy: String,
    minutesStudy: String,
    hoursStudy: String,
    questionTitle: String,
    studyOrTestState: String

) {
            Row(modifier = Modifier.fillMaxWidth()) {

                Column(
                    modifier = Modifier.weight(7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = questionTitle,
                        style = MaterialTheme.typography.body2
                    )
                }

                if (studyOrTestState == Constants.SELECTED_TEST_KEY) {
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

                } else if (studyOrTestState == SELECTED_STUDY_KEY){
                    Row(modifier = Modifier.weight(3f)) {
                        Text(
                            text = hoursStudy,
                            style = MaterialTheme.typography.body2
                        )
                        Text(
                            text = ":",
                            style = MaterialTheme.typography.body2
                        )
                        Text(
                            text = minutesStudy,
                            style = MaterialTheme.typography.body2
                        )
                        Text(
                            text = ":",
                            style = MaterialTheme.typography.body2
                        )
                        Text(
                            text = secondsStudy,
                            style = MaterialTheme.typography.body2
                        )

//                    }
                    }

                } else if (studyOrTestState == Constants.SHOWANSWERFORTEST){
                    Text(
                        text = "",
                        style = MaterialTheme.typography.body2
                    )
                }

            }



}