package com.pktech.presentation.screens.subjects.eng.year.eng2012

import android.content.ContentValues
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.English
import com.pktech.data.repository.UiRepository
import com.pktech.navigation.screens.EnglishObjYear
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.QuestionIndexSheetTheory
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.eng.year.eng2012.items.EnglishAnswerTheory
import com.pktech.presentation.screens.subjects.eng.year.eng2012.items.EnglishQuestionTheory
import com.pktech.presentation.screens.subjects.items.DisplayAlertDialog
import com.pktech.presentation.screens.subjects.items.StudyTheoryUIItems
import com.pktech.presentation.screens.subjects.items.StudyTopBar
import com.pktech.presentation.screens.subjects.items.StudyTopBarTheory
import com.pktech.presentation.screens.subjects.questionIndexSheetRepoEng
import com.pktech.ui.theme.White
import com.pktech.utill.Constants
import com.pktech.utill.SaveQuestionConstants
import kotlinx.coroutines.launch
import java.text.DateFormat
import java.util.*

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Eng2012Theory(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
){
    val context = LocalContext.current
    val uiRepository = UiRepository()
    val questionIndexTheorySheetDataClass = uiRepository.questionIndexTheorySheetDataClass
    val scope = rememberCoroutineScope()
    val studyOrTestKey = StudyOrTestKey(context)
    val subjectVM: SubjectVM = hiltViewModel()
    val english2012VM: English2012VM = hiltViewModel()
    val questionTitle = SaveQuestionConstants.ENGLISH2012


    val english2012 by english2012VM.getEnglish2012.observeAsState(listOf<English>())
    val english2012R = english2012VM.getEnglish2012.value
    english2012::class.java

    var currentIndex by remember { mutableStateOf(0) }




    val questionIndex = english2012R?.english?.get(currentIndex)?.theory?.id
    val currentQuestion = english2012R?.english?.get(currentIndex)?.theory?.question
    val answer = english2012R?.english?.get(currentIndex)?.theory?.answer
    val currentInstructions = english2012R?.english?.get(currentIndex)?.theory?.instructions



    subjectVM.addSaveQuestionData.value.questionTitle = SaveQuestionConstants.ENGLISH2012

    if (currentInstructions != null) {
        subjectVM.addSaveQuestionData.value.instructions = currentInstructions
    }
    if (questionIndex != null) {
        subjectVM.addSaveQuestionData.value.questionIndex = questionIndex
    }
    if (currentQuestion != null) {
        subjectVM.addSaveQuestionData.value.question = currentQuestion
    }

    if (answer != null) {
        subjectVM.addSaveQuestionData.value.answer = answer
    }


    val studyOrTestKeyState = studyOrTestKey.getKey.collectAsState(initial = "")
    val studyOrTestKeyValue = studyOrTestKeyState.value

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )

    var openInstruction by remember { mutableStateOf(false) }
    var expandedState by remember { mutableStateOf(false) }

    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                content = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(White)) {
                        QuestionIndexSheetTheory(
                            onQuestionIndexClick = {
                                currentIndex = it
                                scope.launch {
                                    if(sheetState.isCollapsed) {
                                        sheetState.expand()
                                    } else {
                                        sheetState.collapse()
                                    }
                                }

                            },
                            list = questionIndexTheorySheetDataClass
                        )

                    }

                }
            )
        },
        sheetPeekHeight = 0.dp
    ) {

        Scaffold(
            topBar = {
                var openDialog by remember { mutableStateOf(false) }

                DisplayAlertDialog(
                    openDialog = openDialog,
                    closeDialog = { openDialog = false},
                    onYesClickedStudy = {
                        onYesClickStudy()
                    },
                    onYesClickedTest = {
                        onYesClickTest()
                    },
                    studyOrTestKey = studyOrTestKeyValue
                )
                StudyTopBarTheory(
                    onEndQuizClick = {
                        openDialog = true
                    },
                    questionTitle = questionTitle
                )
            }
        ) {

            val snackbarHostStateForSaveQuestion = remember { SnackbarHostState() }
                if (currentInstructions != null) {
                    if (questionIndex != null) {
                        StudyTheoryUIItems(
                            instructions = currentInstructions,
                            onSaveIconClick = {
                                subjectVM.addSaveQuestion()
                                scope.launch {
                                    snackbarHostStateForSaveQuestion.showSnackbar("Successfully Added To Save Question List")
                                }
                            },
                            currentQuestion = {
                                if (currentQuestion != null) {
                                    EnglishQuestionTheory(question = currentQuestion)
                                }
                            },
                            currentAnswer = {
                                if (answer != null) {
                                    EnglishAnswerTheory(answer = answer)
                                }
                            },
                            questionIndex = questionIndex,
                            onGotoQuestionNoClick = {
                                scope.launch {
                                    if(sheetState.isCollapsed) {
                                        sheetState.expand()
                                    } else {
                                        sheetState.collapse()
                                    }
                                }
                            },
                            onNextBtClick = {
                                if (currentIndex == 19){
                                    Toast.makeText(context, "Last Question", Toast.LENGTH_SHORT).show()
                                }else if(expandedState){
                                    expandedState = false
                                    currentIndex++
                                }else{
                                    currentIndex++
                                }
                            },
                            onPreviousBtClick = {
                                if (currentIndex == 0){
                                    Toast.makeText(context, "Fist Question", Toast.LENGTH_SHORT).show()
                                }else if(expandedState){
                                    expandedState = false
                                    currentIndex--
                                }else{
                                    currentIndex--

                                }
                            },
                            questionSize = questionIndexTheorySheetDataClass.size.toString(),
                            studyOrTestState = studyOrTestKeyValue,
                            onShowAnswerClick = { expandedState = !expandedState },
                            onShowAnswerIconClick = {expandedState = !expandedState },
                            expandedState = expandedState,
                            openInstruction = { openInstruction = true },
                            snackbarHostStateForSaveQuestion = snackbarHostStateForSaveQuestion,
                        )
                    }
                }



        }
    }

}