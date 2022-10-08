package com.pktech.presentation.screens.subjects.account.year.account2017

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
fun Account2017Theory(){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Account 2017 Theory",
            style = MaterialTheme.typography.h2,
        )

    }
}

