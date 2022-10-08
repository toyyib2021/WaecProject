package com.pktech.presentation.screens.subjects.items


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pktech.utill.Constants.SELECTED_TEST_KEY
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White


@Composable
fun DisplayAlertDialog(
    openDialog: Boolean,
    closeDialog: () -> Unit,
    onYesClickedTest: () -> Unit,
    onYesClickedStudy: () -> Unit,
    studyOrTestKey: String
) {
    if (openDialog) {
        AlertDialog(
            title = {
                if (studyOrTestKey != SELECTED_TEST_KEY) {
                    run {
                        Text(
                            text = "End Study",
                            style = MaterialTheme.typography.h2
                        )
                    }
                } else if (studyOrTestKey == SELECTED_TEST_KEY) {
                    run {
                        Text(
                            text = "End Test",
                            style = MaterialTheme.typography.h2
                        )
                    }
                }
            },
            text = {
                Text(
                    text = "Are you sure you want to end the study",
                    style = MaterialTheme.typography.body2
                )
            },
            onDismissRequest = { closeDialog() },
            confirmButton = {
                Button(
                    modifier = Modifier.width(80.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = VeryDarkGray,
                        contentColor = White
                    ),
                    onClick = {
                    if (studyOrTestKey != SELECTED_TEST_KEY) {
                        onYesClickedStudy()
                        closeDialog()
                    } else if (studyOrTestKey == SELECTED_TEST_KEY) {
                        onYesClickedTest()
                        closeDialog()
                    }

                }) {
                    Text(text = "Yes")
                }
            },
            dismissButton = {
                OutlinedButton(
                    modifier = Modifier.width(80.dp),
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(5.dp, color = VeryDarkGray),
                    onClick = { closeDialog() }
                ) {
                    Text(text = "No", color = VeryDarkGray)
                }
            }
        )

    }
}
