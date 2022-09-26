package com.pktech.presentation.screens.subjects.eng.uiItems

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.pktech.domain.model.Objective
import com.pktech.ui.theme.VeryDarkGray



@Composable
fun EnglishQuestionUI(objective: Objective){
    Text(
        text = buildAnnotatedString {
            append(objective.question)
            withStyle(
                style = SpanStyle(
                    color = VeryDarkGray,
                    fontSize = MaterialTheme.typography.subtitle1.fontSize,
                    textDecoration = TextDecoration.Underline
                )
            ){
                append(objective.questionUnderline)
            }
            append(objective.questionEnd)
        },
        color = VeryDarkGray,
        style = MaterialTheme.typography.subtitle1
    )
}