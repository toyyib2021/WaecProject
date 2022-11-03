package com.pktech.presentation.screens.subjects

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pktech.domain.model.QuestionIndexSheetDataClass
import com.pktech.domain.model.QuestionIndexTheorySheetDataClass
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import java.security.cert.CertPath

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuestionIndexSheet(
    onQuestionIndexClick: (Int) -> Unit,
    list: List<QuestionIndexSheetDataClass>,
){

//    val list = questionIndexSheetRepo(optionSelectState = optionSelectState)
    LazyVerticalGrid(
        modifier = Modifier
            .padding(10.dp),
        cells = GridCells.Adaptive(minSize = 70.dp),
    ) {
        items(list) { index ->
            SingleQuestionIndexSheet(
                questionIndexSheetDataClass = index,
                onQuestionIndexClick = {
                    val id = index.id -1
                    onQuestionIndexClick(id)
                }
            )
        }
    }

}


@Composable
fun SingleQuestionIndexSheet(
    questionIndexSheetDataClass: QuestionIndexSheetDataClass,
    onQuestionIndexClick: () -> Unit
){
    Card(
        modifier = Modifier
            .height(50.dp)
            .width(30.dp)
            .padding(10.dp)
            .clickable { onQuestionIndexClick() },
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(5.dp, VeryDarkGray),
        content = {
            Column(
                modifier = Modifier
                    .background(questionIndexSheetDataClass.bgColor),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = questionIndexSheetDataClass.id.toString(),
                    color = questionIndexSheetDataClass.txColor,
                    style = MaterialTheme.typography.body2
                )
            }

        }
    )
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun QuestionIndexSheetTheory(
    onQuestionIndexClick: (Int) -> Unit,
    list: List<QuestionIndexTheorySheetDataClass>,
){

    LazyVerticalGrid(
        modifier = Modifier
            .padding(10.dp),
        cells = GridCells.Adaptive(minSize = 70.dp),
    ) {
        items(list) { index ->
            SingleQuestionIndexSheetTheory(
                questionIndexTheorySheetDataClass = index,
                onQuestionIndexClick = {
                    val id = index.id -1
                    onQuestionIndexClick(id)
                }
            )
        }
    }

}


@Composable
fun SingleQuestionIndexSheetTheory(
    questionIndexTheorySheetDataClass: QuestionIndexTheorySheetDataClass,
    onQuestionIndexClick: () -> Unit
){
    Card(
        modifier = Modifier
            .height(70.dp)
            .width(50.dp)
            .padding(10.dp)
            .clickable { onQuestionIndexClick() },
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(5.dp, VeryDarkGray),
        content = {
            Column(
                modifier = Modifier
                    .background(White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = questionIndexTheorySheetDataClass.id.toString(),
                    color = VeryDarkGray,
                    style = MaterialTheme.typography.body2
                )
            }

        }
    )
}