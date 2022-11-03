package com.pktech.presentation.screens.saveQuestion.items

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.layout.Column
import com.pktech.R
import com.pktech.presentation.screens.subjects.items.DisplayInstructionDialog
import com.pktech.ui.theme.*


@Composable
fun SaveQuestionContent(
    instruction: String,
    questionIndex: String,
    questionTitle: String,
    CurrentQuestion: @Composable () -> Unit,
    onDeleteClick: () -> Unit,
    CurrentSaveAnswer: @Composable () -> Unit,
    OptionA: @Composable () -> Unit,
    OptionB: @Composable () -> Unit,
    OptionC: @Composable () -> Unit,
    OptionD: @Composable () -> Unit,


) {

    var expandedState by remember { mutableStateOf(false) }
    var openInstruction by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),

        shape = RoundedCornerShape(10.dp),
    ) {
        DisplayInstructionDialog(
            openInstruction = openInstruction,
            closeInstruction = { openInstruction = false },
            instruction = instruction
        )
        Column(
            modifier = Modifier.background(DarkBlue). padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.padding(2.dp))

            QuestionSection(
                questionIndex = questionIndex,
                questionTitle = questionTitle,
                currentQuestion = { CurrentQuestion() },
                openInstruction = { openInstruction = true },
                instructions = instruction,
                onDeleteClick = { onDeleteClick() },
            )

            Spacer(modifier = Modifier.padding(2.dp))

            AnswerSection(
                currentAnswer = { CurrentSaveAnswer() },
                expandedState = expandedState ,
                onShowAnswerClick = { expandedState = !expandedState },
                onShowAnswerIconClick = { expandedState = !expandedState }
            )

            Spacer(modifier = Modifier.padding(2.dp))

            OptionSection(
                optionA = { OptionA() },
                optionB = { OptionB() },
                optionC = { OptionC() },
                optionD = { OptionD() },
            )
        }

    }

}

@Composable
fun QuestionSection(
    questionIndex: String,
    questionTitle: String,
    currentQuestion: @Composable () -> Unit,
    openInstruction: () -> Unit,
    instructions: String,
    onDeleteClick: () -> Unit,
    ) {
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Card(modifier = Modifier
            .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp)
        ) {
                Row(
                    modifier = Modifier.padding(5.dp).fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        modifier = Modifier.weight(8f),
                        text = questionTitle,
                        color = VeryDarkGray,
                        style = MaterialTheme.typography.body2,
                    )

                        IconButton(
                            modifier = Modifier.weight(2f),
                            onClick = {
                                onDeleteClick()
                            }) {
                            Icon(
                                Icons.Filled.Delete,
                                tint = VeryDarkGray,
                                contentDescription = stringResource(id = R.string.icon)
                            )
                        }



                }


        }

        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .clickable { openInstruction() },
            text = instructions,
            color = White,
            style = MaterialTheme.typography.body2,
            overflow = TextOverflow.Ellipsis,
            maxLines = 2


        )

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .weight(2f)
            ) {

                Text(
                    text = "Ques",
                    color = White,
                    style = MaterialTheme.typography.subtitle1
                )
                Text(
                    text = questionIndex,
                    color = White,
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
fun AnswerSection(
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
                style = MaterialTheme.typography.body2,
                color = White
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
                    tint = Color.White,
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