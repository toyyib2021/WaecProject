package com.pktech.presentation.screens.subjects.chemistry.year.chy2021

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import androidx.core.math.MathUtils
import com.pktech.data.repository.UiRepository
import com.pktech.domain.model.UiDataClass

@Composable
fun Chemistry2021Theory(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Chemistry 2021 Theory",
            style = MaterialTheme.typography.h2,
        )

    }
}

