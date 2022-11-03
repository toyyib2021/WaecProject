package com.pktech.presentation.screens.subjects.civilEdu.year.civil2014

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.CivicEdu
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.repository.UiRepository
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2014.items.CivicEduQuestion
import com.pktech.presentation.screens.subjects.items.*
import com.pktech.presentation.screens.subjects.questionIndexSheetRepo
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.SaveQuestionConstants
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Civic2014Obj(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
) {

    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val civicEdu2014VM: CivicEdu2014VM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val scope = rememberCoroutineScope()



    val studyOrTestKeyValue = studyOrTestKey.getKey.collectAsState(initial = "")

    val civicEdu2014 by civicEdu2014VM.getCivicEdu2014.observeAsState(listOf<CivicEdu>())
    val civicEdu2014R = civicEdu2014VM.getCivicEdu2014.value
    civicEdu2014::class.java

    var currentIndex by remember { mutableStateOf(0) }

    val questionIndex = civicEdu2014R?.civic?.get(currentIndex)?.objective?.id
    val currentQuestion = civicEdu2014R?.civic?.get(currentIndex)?.objective?.question
    val mainOptionA = civicEdu2014R?.civic?.get(currentIndex)?.objective?.optionA
    val mainOptionB = civicEdu2014R?.civic?.get(currentIndex)?.objective?.optionB
    val mainOptionC = civicEdu2014R?.civic?.get(currentIndex)?.objective?.optionC
    val mainOptionD = civicEdu2014R?.civic?.get(currentIndex)?.objective?.optionD
    val answer = civicEdu2014R?.civic?.get(currentIndex)?.objective?.explanation
    val essay = civicEdu2014R?.civic?.get(currentIndex)?.objective?.essay
    val currentInstructions = civicEdu2014R?.civic?.get(currentIndex)?.objective?.instructions
    val correctOption = civicEdu2014R?.civic?.get(currentIndex)?.objective?.correctOption




    val alphabetOptionA = uiRepository.alphabetOptions[currentIndex].options[0]
    val alphabetOptionB = uiRepository.alphabetOptions[currentIndex].options[1]
    val alphabetOptionC = uiRepository.alphabetOptions[currentIndex].options[2]
    val alphabetOptionD = uiRepository.alphabetOptions[currentIndex].options[3]



    val getSelectedOption by subjectVM.getSelectedOption.observeAsState(listOf())
    val getSelectedOptionR = subjectVM.getSelectedOption.value
    getSelectedOption::class.java

    val getSelectedOptionCol by subjectVM.getSelectedOptionCol.observeAsState(listOf())
    val getSelectedOptionColR = subjectVM.getSelectedOptionCol.value
    getSelectedOptionCol::class.java

    var selectedOptionState by remember { mutableStateOf("") }
    val currentSelectedOption = getSelectedOptionR?.get(currentIndex)?.selectedOption
    val currentSelectedOptionId = getSelectedOptionR?.get(currentIndex)?.id

    if (currentSelectedOption != null) {
        selectedOptionState  =  currentSelectedOption

    }

    var expandedState by remember { mutableStateOf(false) }
    var openDialog by remember { mutableStateOf(false) }
    var openInstruction by remember { mutableStateOf(false) }
    var correctOptionColor by remember { mutableStateOf("") }

    val snackbarHostStateForSaveQuestion = remember { SnackbarHostState() }



    val snackbarHostState = remember { SnackbarHostState() }
    LaunchedEffect(key1 = subjectVM.minutes, key2 = subjectVM.seconds){
        if (subjectVM.minutes == "05" && subjectVM.seconds == "00" ){
            scope.launch {
                snackbarHostState.showSnackbar("You have five minutes left")
            }
        }else if (subjectVM.minutes == "01" && subjectVM.seconds == "00" ){
            scope.launch {
                snackbarHostState.showSnackbar("You have one minutes left")
            }
        }else if (subjectVM.minutes == "00" && subjectVM.seconds == "-10" ){
            scope.launch {
                snackbarHostState.showSnackbar("TIME UP")
            }
            onYesClickTest()
        }

    }

    LaunchedEffect(key1 = true){
        subjectVM.start()
    }

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )


    BackHandlerFun(backHandler = { openDialog = true })


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

                        getSelectedOptionColR?.let {
                            questionIndexSheetRepo(
                                optionSelectState = it,
                            )
                        }?.let {
                            QuestionIndexSheet(
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
                                list = it
                            )
                        }

                    }

                }
            )
        },
        sheetPeekHeight = 0.dp
    ) {

        Scaffold(
            topBar = {
                DisplayAlertDialog(
                    openDialog = openDialog,
                    closeDialog = { openDialog = false},
                    onYesClickedStudy = { onYesClickStudy() },
                    onYesClickedTest = { onYesClickTest() },
                    studyOrTestKey = studyOrTestKeyValue.value
                )
                StudyTopBar(
                    onEndQuizClick = {
                        openDialog = true
                    },
                    hours = subjectVM.hours,
                    minutes = subjectVM.minutes,
                    seconds = subjectVM.seconds,
                    studyOrTestState = studyOrTestKeyValue.value,
                    questionTitle = SaveQuestionConstants.ACCOUNTING2012,
                    secondsStudy = subjectVM.secondsStudy,
                    minutesStudy = subjectVM.minutesStudy,
                    hoursStudy = subjectVM.hoursStudy
                )
            }
        ) {

            if (currentInstructions != null && questionIndex != null) {
                DisplayInstructionDialog(
                    openInstruction = openInstruction,
                    closeInstruction = { openInstruction = false },
                    instruction = currentInstructions
                )

                StudyObjUIItems(
                    instructions = currentInstructions,
                    openInstruction = { openInstruction = true },
                    questionSize = civicEdu2014R.civic.size.toString(),
                    studyOrTestState = studyOrTestKeyValue.value,
                    onSaveIconClick = {
                        subjectVM.addSaveQuestion()
                        scope.launch {
                            snackbarHostStateForSaveQuestion.showSnackbar("Successfully Added To Save Question List")
                        }

                    },
                    onShowAnswerIconClick = {
                        if (!expandedState) {
                            if (correctOption != null){
                                correctOptionColor = correctOption
                            }

                        }
                        expandedState = !expandedState
                    },
                    onShowAnswerClick = {
                        if (!expandedState) {
                            if (correctOption != null){
                                correctOptionColor = correctOption
                            }

                        }
                        expandedState = !expandedState
                    },
                    expandedState = expandedState,
                    currentAnswer = {
                        if (answer != null) {
                            CurrentAnswer(answer = answer)
                        }
                    },
                    questionIndex = questionIndex,
                    currentQuestion = {
                        if (currentQuestion != null) {
                            if (essay != null) {
                                CurrentQuestion {
                                    CivicEduQuestion(
                                        question = currentQuestion,
                                        essay = essay
                                    )
                                }
                            }
                        }
                    },
                    onGotoQuestionNoClick = {
                        scope.launch {
                            if(sheetState.isCollapsed) {
                                sheetState.expand()
                            } else {
                                sheetState.collapse()
                            }
                        }
                    },
                    onPreviousBtClick = {
                        if (currentIndex == 0){

                            Toast.makeText(context, "Fist Question", Toast.LENGTH_SHORT).show()
                        }else if(expandedState){
                            expandedState = false
                            currentIndex--
                            correctOptionColor = ""
                        }else{
                            currentIndex--
                            correctOptionColor = ""
                        }
                    },
                    onNextBtClick = {
                        if (currentIndex == 49){
                            Toast.makeText(context, "Last Question", Toast.LENGTH_SHORT).show()
                        }else if(expandedState){
                            expandedState = false
                            currentIndex++
                            correctOptionColor = ""
                        }else {
                            currentIndex++
                            correctOptionColor = ""
                        }
                    },
                    optionA = {
                        if (currentSelectedOption != null  && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                Option(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionA,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionA
                                        val updatedSelectedOptionA =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionA)

                                    },
                                    currentOption = {
                                        if (mainOptionA != null ) {
                                            CurrentOption(
                                                option = mainOptionA,
                                            )
                                        }
                                    },
                                    emptyCorrectOption = correctOptionColor
                                )

                            }
                        }
                    },
                    optionB = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                Option(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionB,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionB
                                        val updatedSelectedOptionB =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionB)
                                    },
                                    currentOption = {
                                        if (mainOptionB != null ) {
                                            CurrentOption(
                                                option = mainOptionB,
                                            )
                                        }
                                    },
                                    emptyCorrectOption = correctOptionColor
                                )
                            }
                        }

                    },
                    optionC = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                Option(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionC,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionC
                                        val updatedSelectedOptionC =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionC)
                                    },
                                    currentOption = {
                                        if (mainOptionC != null ) {
                                            CurrentOption(
                                                option = mainOptionC,
                                            )
                                        }
                                    },
                                    emptyCorrectOption = correctOptionColor
                                )
                            }
                        }

                    },
                    optionD = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                Option(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionD,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionD
                                        val updatedSelectedOptionD =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionD)
                                    },
                                    currentOption = {
                                        if (mainOptionD != null) {
                                            CurrentOption(
                                                option = mainOptionD,
                                            )
                                        }
                                    },
                                    emptyCorrectOption = correctOptionColor
                                )
                            }
                        }

                    },
                    snackbarHostStateForTime = snackbarHostState,
                    snackbarHostStateForSaveQuestion = snackbarHostStateForSaveQuestion
                )
            }

        }
    }


}

