package com.pktech.presentation.screens.saveQuestion

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.pktech.R
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import com.pktech.utill.SaveQuestionConstants.MATHS2012

@Composable
fun SaveQuestion() {

   Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Save Question", style = MaterialTheme.typography.h1)
    }
}



@Composable
private fun SaveQuestionSection(
    instructions: String,
    questionIndex: String,
    questionTitle: String,
    currentQuestion: @Composable () -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = questionTitle,
                        color = VeryDarkGray,
                        style = MaterialTheme.typography.body2,
                    )
                }


        }

        Spacer(modifier = Modifier.padding(10.dp))


        if (instructions != ""){

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                text = instructions,
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1


            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = questionIndex,
                    color = VeryDarkGray,
                    style = MaterialTheme.typography.body2
                )
            }

            Column(
                modifier = Modifier
                    .weight(9f)
            ) {

                currentQuestion()

            }
        }


    }
}


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
private fun SaveQuestion(
    question: String,
    imageUrl: String,
    bitmap: ImageBitmap,
    essay: String,
    questionTitle: String,
    answer: String,
    questionUnderline: String = "",
    questionEnd: String = "",
){

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        if(questionUnderline == ""){
            Text(
                text = question,
                style = MaterialTheme.typography.body2,
                color = VeryDarkGray
            )
        }else{
            Text(
                text = buildAnnotatedString {
                    append(question)
                    withStyle(
                        style = SpanStyle(
                            color = VeryDarkGray,
                            fontSize = MaterialTheme.typography.body2.fontSize,
                            textDecoration = TextDecoration.Underline
                        )
                    ){
                        append(questionUnderline)
                    }
                    append(questionEnd)
                },
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }

        Spacer(modifier = Modifier.fillMaxWidth(). padding(10.dp))

        if (imageUrl != ""){
            Image(bitmap, contentDescription = "image")
        }


        if (questionTitle == MATHS2012 && essay != ""){
            when(essay){
                "s" -> {}
                "d" -> {}
            }
        }









    }
}