package com.pktech.presentation.screens.subjects.eng.year.eng2012.items

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.VeryDarkGray

    /// OBJECTIVE ///
@Composable
fun EnglishQuestion(
    question: String,
    underline: String,
    endLine: String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {

        CurrentQuestion(option = question, underline = underline, endLine =endLine ,)
    }
}

@Composable
fun CurrentQuestion(option: String, underline: String, endLine: String){
    val  underlineSpanStyle =  SpanStyle(
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.body2.fontSize,
        textDecoration = TextDecoration.Underline,
    )

    Text(
        text = buildAnnotatedString {
            append(option)
            withStyle( underlineSpanStyle){
                append(underline)
            }
            append(endLine)
        },
        color = VeryDarkGray,
        style = MaterialTheme.typography.body2,
    )

}


/// THEORY //
@Composable
fun EnglishQuestionTheory(
    question: String,

) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {

        Text(
            text = question,
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2,
        )
    }
}

@Composable
fun EnglishAnswerTheory(
    answer: String,

    ) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {

        Text(
            text = answer,
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2,
        )
    }
}