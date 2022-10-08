package com.pktech.presentation.screens.subjects.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pktech.utill.BackHandlerFun

@Composable
fun TestResult(
    backHandler: () -> Unit
){

    BackHandlerFun(backHandler = { backHandler() })
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "RESULT")
        
    }
    
}