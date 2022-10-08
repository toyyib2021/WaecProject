package com.pktech.presentation.screens.items

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.VeryDarkGray

@Composable
fun SnackbarHostFun(snackbarHostState : SnackbarHostState){

        SnackbarHost(
            hostState = snackbarHostState,
            snackbar = {
                Snackbar (
                    backgroundColor = VeryDarkGray,
                    action = {
                        Text(
                            text = snackbarHostState.currentSnackbarData?.actionLabel?:"",
                            modifier = Modifier
                                .padding(16.dp)
                                .clickable {
                                    snackbarHostState.currentSnackbarData?.dismiss()
                                },
                            style = MaterialTheme.typography.body2
                        )
                    }
                ){
                    Text(text = snackbarHostState.currentSnackbarData?.message?:"")
                }
            },
        )

}