package com.pktech.presentation.screens.subjects.items

import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.pktech.presentation.screens.subjects.SubjectVM
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TimeUpAction(
    subjectVM: SubjectVM,
    scope: CoroutineScope,
    snackbarHostState: SnackbarHostState,
    onYesClickTest: () -> Unit
) {
    LaunchedEffect(key1 = subjectVM.minutesEng, key2 = subjectVM.secondsEng) {
        if (subjectVM.minutesEng == "05" && subjectVM.secondsEng == "00") {
            scope.launch {
                snackbarHostState.showSnackbar("You have five minute left")
            }
        } else if (subjectVM.minutesEng == "01" && subjectVM.secondsEng == "00") {
            scope.launch {
                snackbarHostState.showSnackbar("You have one minute left")
            }
        } else if (subjectVM.minutesEng == "00" && subjectVM.secondsEng == "02") {
            scope.launch {
                snackbarHostState.showSnackbar("TIME UP")
            }
        } else if (subjectVM.minutesEng == "00" && subjectVM.secondsEng == "-5") {
            onYesClickTest()
        }
    }
}