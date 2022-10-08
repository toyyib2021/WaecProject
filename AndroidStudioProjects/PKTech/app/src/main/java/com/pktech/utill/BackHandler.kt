package com.pktech.utill

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable

@Composable
fun BackHandlerFun(backHandler: () -> Unit) {
    BackHandler {
       backHandler()

    }
}