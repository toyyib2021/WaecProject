package com.pktech.presentation.screens.subjects.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PowerSettingsNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pktech.R
import com.pktech.presentation.screens.subjects.maths.uiItems.TopAppBarTextAndTime

@Composable
fun StudyTopBar(
    onEndQuizClick: () -> Unit,
    seconds: String,
    minutes: String,
    hours: String


) {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,

                ) {

                TopAppBarTextAndTime(
                    seconds = seconds,
                    minutes = minutes,
                    hours = hours
                )
//                Text(text = stringResource(R.string.mathe2010))

            }
        },
        navigationIcon = {
            IconButton(onClick = { onEndQuizClick() }) {
                Icon(
                    Icons.Filled.PowerSettingsNew,
                    contentDescription = stringResource(id = R.string.icon)
                )
            }
        },
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 10.dp
    )
}