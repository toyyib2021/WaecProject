package com.pktech.presentation.screens.subjects.items


import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.foundation.background
import com.pktech.utill.Constants.SELECTED_TEST_KEY
import com.pktech.R

import com.pktech.ui.theme.*
import com.pktech.utill.Constants


@Composable
fun StudyObjUIItems(
    instructions: String,
    onSaveIconClick: () -> Unit,
    currentAnswer:@Composable () -> Unit,
    questionIndex: String,
    currentQuestion:@Composable () -> Unit,
    onGotoQuestionNoClick: () -> Unit,
    onNextBtClick: () -> Unit,
    onPreviousBtClick: () -> Unit,
    optionA:@Composable () -> Unit,
    optionB:@Composable () -> Unit,
    optionC:@Composable () -> Unit,
    optionD:@Composable () -> Unit,
    questionSize: String,
    studyOrTestState: String,
    onShowAnswerClick: () -> Unit,
    onShowAnswerIconClick: () -> Unit,
    expandedState: Boolean,
    openInstruction: () -> Unit,
    snackbarHostStateForTime: SnackbarHostState,
    snackbarHostStateForSaveQuestion: SnackbarHostState

) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
    ) {

        SnackbarHost(
            hostState = snackbarHostStateForTime,
            snackbar = { snackbarData: SnackbarData ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(5.dp, Color.Red),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.Red),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Icon(imageVector = Icons.Default.Notifications,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(text = snackbarData.message,
                            style = MaterialTheme.typography.body2,
                            color = Color.White
                        )

                    }
                }
            }
        )

        SectionOne(
            modifier = Modifier
                .weight(5f)
                .fillMaxWidth(),
            instructions = instructions,
            currentAnswer = currentAnswer,
            questionIndex = questionIndex,
            currentQuestion = currentQuestion,
//            optionA = optionA,
//            optionB = optionB,
//            optionC = optionC,
//            optionD = optionD,
            questionSize = questionSize,
            studyOrTestState = studyOrTestState,
            onShowAnswerClick = onShowAnswerClick,
            onShowAnswerIconClick = onShowAnswerIconClick,
            expandedState = expandedState,
            onSaveIconClick = onSaveIconClick,
            openInstruction = openInstruction
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(4f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LazyColumn{
                item{
                    OptionSection(
                        optionA = optionA,
                        optionB = optionB,
                        optionC = optionC,
                        optionD = optionD
                    )
                }
            }
        }

        SnackbarHost(
            hostState = snackbarHostStateForSaveQuestion,
            snackbar = { snackbarData: SnackbarData ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    backgroundColor = DarkBlue
                ) {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(DarkBlue)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {

                        Text(text = snackbarData.message,
                            style = MaterialTheme.typography.body2,
                            color = White
                        )

                    }
                }
            }
        )

        BottomSection(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            onNextBtClick = onNextBtClick,
            onPreviousBtClick = onPreviousBtClick,
            onGotoQuestionNoClick = onGotoQuestionNoClick
        )

    }

}


@Composable
fun SectionOne(
    modifier: Modifier,
    instructions: String,
    currentAnswer:@Composable () -> Unit,
    questionIndex: String,
    currentQuestion: @Composable () -> Unit,
//    optionA:@Composable () -> Unit,
//    optionB:@Composable () -> Unit,
//    optionC:@Composable () -> Unit,
//    optionD:@Composable () -> Unit,
    questionSize: String,
    studyOrTestState: String,
    onShowAnswerClick: () -> Unit,
    onShowAnswerIconClick: () -> Unit,
    expandedState: Boolean,
    onSaveIconClick: () -> Unit,
    openInstruction: () -> Unit

) {

    LazyColumn(modifier = modifier){
        item {
            QuestionSection(
                instructions = instructions,
                questionIndex,
                questionSize = questionSize,
                currentQuestion = currentQuestion,
                onSaveIconClick = onSaveIconClick,
                openInstruction = openInstruction

            )
            when(studyOrTestState){
                Constants.SELECTED_STUDY_KEY -> {
                    AnswerSection(
                        currentAnswer = currentAnswer,
                        onShowAnswerClick = onShowAnswerClick,
                        onShowAnswerIconClick = onShowAnswerIconClick,
                        expandedState = expandedState

                    )
                }

            }
//            if (studyOrTestState != SELECTED_TEST_KEY){
//                AnswerSection(
//                    currentAnswer = currentAnswer,
//                    onShowAnswerClick = onShowAnswerClick,
//                    onShowAnswerIconClick = onShowAnswerIconClick,
//                    expandedState = expandedState
//
//                )
//            }


        }

    }


}

@Composable
private fun QuestionSection(
    instructions: String,
    questionIndex: String,
    questionSize: String,
    onSaveIconClick: () -> Unit,
    currentQuestion: @Composable () -> Unit,
    openInstruction: () -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Card(modifier = Modifier
            .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(White),
                verticalAlignment = Alignment.CenterVertically,

            ) {
                Column(
                    modifier = Modifier.weight(8f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = " Question $questionIndex /  $questionSize ",
                        color = VeryDarkGray,
                        style = MaterialTheme.typography.body2,
                    )
                }


                IconButton(
                    modifier = Modifier
                        .weight(2f),
                    onClick = { onSaveIconClick() }) {
                    Icon(
                        Icons.Outlined.Bookmark,
                        contentDescription = stringResource(id = R.string.icon),
                        tint = Color.Black
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))


        if (instructions != ""){

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clickable { openInstruction() },
                text = instructions,
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2


            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
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


@Composable
private fun AnswerSection(
    currentAnswer:@Composable () -> Unit,
    expandedState: Boolean,
    onShowAnswerClick: () -> Unit,
    onShowAnswerIconClick: () -> Unit
) {


    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
//                    expandedState = !expandedState
                    onShowAnswerClick()
                }
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(8f),
                text = "Show Answer",
                style = MaterialTheme.typography.body2
            )
            IconButton(
                modifier = Modifier
                    .weight(2f)
                    .rotate(rotationState),
                onClick = {
//                    expandedState = !expandedState
                    onShowAnswerIconClick()
                }) {
                Icon(
                    Icons.Filled.ArrowDropDown,
                    tint = Color.Black,
                    contentDescription = stringResource(id = R.string.icon)
                )
            }


        }
        if (expandedState){
            currentAnswer()
        }
    }

}



@Composable
fun OptionSection(
    optionA:@Composable () -> Unit,
    optionB:@Composable () -> Unit,
    optionC:@Composable () -> Unit,
    optionD: @Composable () -> Unit,

) {

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        optionA()
        optionB()
        optionC()
        optionD()
    }

}



@Composable
fun BottomSection(
    modifier: Modifier,
    onNextBtClick: () -> Unit,
    onPreviousBtClick: () -> Unit,
    onGotoQuestionNoClick: () -> Unit,
) {

    Column(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.clickable { onGotoQuestionNoClick() },
                text = "Goto Question No.")

            Button(
                modifier = Modifier.width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
                shape = RoundedCornerShape(9.dp),
                border = BorderStroke(5.dp, color = VeryDarkGray),
                onClick = {onPreviousBtClick() }) {
                Text(
                    text = stringResource(R.string.previous),
                    color = VeryDarkGray,
                    style = MaterialTheme.typography.body2
                )
            }

            Button(
                modifier = Modifier.width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White
                ),
                shape = RoundedCornerShape(9.dp),
                border = BorderStroke(5.dp, color = VeryDarkGray),
                onClick = { onNextBtClick()}) {
                Text(
                    text = stringResource(R.string.next),
                    color = VeryDarkGray,
                    style = MaterialTheme.typography.body2
                )
            }


        }

    }

}









