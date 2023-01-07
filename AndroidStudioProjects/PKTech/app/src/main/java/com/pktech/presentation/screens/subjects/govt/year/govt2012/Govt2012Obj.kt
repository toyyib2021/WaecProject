package com.pktech.presentation.screens.subjects.govt.year.govt2012

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
import androidx.lifecycle.Lifecycle
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.Economics
import com.pktech.data.local.entity.Government
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.utill.QuestionTitleKey
import com.pktech.data.repository.UiRepository
import com.pktech.navigation.screens.EconomicsObjYear
import com.pktech.navigation.screens.GovernmentObjYear
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.economics.year.eco2017.Economics2017VM
import com.pktech.presentation.screens.subjects.eng.year.eng2012.items.EnglishQuestion
import com.pktech.presentation.screens.subjects.govt.year.govt2012.items.GovernmentQuestion
import com.pktech.presentation.screens.subjects.items.*
import com.pktech.presentation.screens.subjects.questionIndexSheetRepo
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.Constants
import com.pktech.utill.SaveQuestionConstants
import com.pktech.utill.SaveQuestionConstants.GOVERNMENT2012
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Govt2012Obj(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
){
    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val governmentVM: Government2012VM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val questionTitleKey = QuestionTitleKey(context)
    val scope = rememberCoroutineScope()
    val questionTitle = GOVERNMENT2012
    val questionRoute = GovernmentObjYear.Obj2012.route

    val getSelectedOption by subjectVM.getSelectedOption.observeAsState(listOf())
    val getSelectedOptionR = subjectVM.getSelectedOption.value
    getSelectedOption::class.java

    val governmentQuestion by governmentVM.getGovernment2012.observeAsState(listOf<Government>())
    val governmentQuestionR = governmentVM.getGovernment2012.value
    governmentQuestion::class.java

    val getSelectedOptionCol by subjectVM.getSelectedOptionCol.observeAsState(listOf())
    val getSelectedOptionColR = subjectVM.getSelectedOptionCol.value
    getSelectedOptionCol::class.java

    // bottomSheet 1 - 100, bottomSheet 1 - 80, bottomSheet 1 - 60, bottomSheet1to100 1 - 50 //
    val bottomSheetList = getSelectedOptionColR?.let { questionIndexSheetRepo(it) }
    val questionSize = governmentQuestionR?.government?.size

    val studyOrTestKeyState = studyOrTestKey.getKey.collectAsState(initial = "")
    val studyOrTestKeyValue = studyOrTestKeyState.value
    val questionTitleKeyState = questionTitleKey.getKey.collectAsState(initial = "")
    val questionTitleKeyValue = questionTitleKeyState.value

    var currentIndex by remember { mutableStateOf(0) }


    val questionIndex = governmentQuestionR?.government?.get(currentIndex)?.objective?.id
    val currentQuestion = governmentQuestionR?.government?.get(currentIndex)?.objective?.question
    val mainOptionA = governmentQuestionR?.government?.get(currentIndex)?.objective?.optionA
    val mainOptionB = governmentQuestionR?.government?.get(currentIndex)?.objective?.optionB
    val mainOptionC = governmentQuestionR?.government?.get(currentIndex)?.objective?.optionC
    val mainOptionD = governmentQuestionR?.government?.get(currentIndex)?.objective?.optionD
    val answer = governmentQuestionR?.government?.get(currentIndex)?.objective?.explanation
    val currentInstructions = governmentQuestionR?.government?.get(currentIndex)?.objective?.instructions
    val correctOption = governmentQuestionR?.government?.get(currentIndex)?.objective?.correctOption
    val underline = governmentQuestionR?.government?.get(currentIndex)?.objective?.questionUnderline
    val endQuestion = governmentQuestionR?.government?.get(currentIndex)?.objective?.questionEnd


    subjectVM.addSaveQuestionData.value.questionTitle = questionTitle

    if (endQuestion != null) {
        subjectVM.addSaveQuestionData.value.questionEnd = endQuestion
    }

    if (underline != null) {
        subjectVM.addSaveQuestionData.value.questionUnderline = underline
    }

    if (currentInstructions != null) {
        subjectVM.addSaveQuestionData.value.instructions = currentInstructions
    }
    if (questionIndex != null) {
        subjectVM.addSaveQuestionData.value.questionIndex = questionIndex
    }
    if (currentQuestion != null) {
        subjectVM.addSaveQuestionData.value.question = currentQuestion
    }
    if (mainOptionA != null) {
        subjectVM.addSaveQuestionData.value.optionA = mainOptionA
    }
    if (mainOptionB != null) {
        subjectVM.addSaveQuestionData.value.optionB = mainOptionB
    }
    if (mainOptionC != null) {
        subjectVM.addSaveQuestionData.value.optionC = mainOptionC
    }
    if (mainOptionD != null) {
        subjectVM.addSaveQuestionData.value.optionD = mainOptionD
    }
    if (answer != null) {
        subjectVM.addSaveQuestionData.value.answer = answer
    }

    val alphabetOptionA = uiRepository.alphabetOptions[currentIndex].options[0]
    val alphabetOptionB = uiRepository.alphabetOptions[currentIndex].options[1]
    val alphabetOptionC = uiRepository.alphabetOptions[currentIndex].options[2]
    val alphabetOptionD = uiRepository.alphabetOptions[currentIndex].options[3]


    var selectedOptionState by remember { mutableStateOf("") }
    val currentSelectedOption = getSelectedOptionR?.get(currentIndex)?.selectedOption
    val currentSelectedOptionId = getSelectedOptionR?.get(currentIndex)?.id

    if (currentSelectedOption != null) {
        selectedOptionState  =  currentSelectedOption

    }
    var openDialog by remember { mutableStateOf(false) }
    var openInstruction by remember { mutableStateOf(false) }
    var expandedState by remember { mutableStateOf(false) }


    val snackbarHostStateForSaveQuestion = remember { SnackbarHostState() }

    val snackbarHostState = remember { SnackbarHostState() }

    TimeUpAction(subjectVM, scope, snackbarHostState, onYesClickTest)


    LaunchedEffect(key1 = studyOrTestKeyValue){
        when(studyOrTestKeyValue){
            Constants.SELECTED_TEST_KEY -> subjectVM.startEng()
        }
    }

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )


    BackHandlerFun(backHandler = { openDialog = true })
    val correctOptionColourState = "A"
    var correctOptionColor = ""


    when(studyOrTestKeyValue){
        Constants.SHOWANSWERFORTEST -> {
            if (correctOptionColourState == "A") {
                if (correctOption != null) {
                    correctOptionColor = correctOption
                }

            }
        }
    }



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
                            .background(White)
                    ) {
                        if (bottomSheetList != null) {
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
                                list = bottomSheetList
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
                var resultKey by remember { mutableStateOf(0) }
                val finailResult by remember { mutableStateOf(0) }
                val splitList = questionTitle.split(" ")
                val splitListSubject = splitList[0]
                val splitListYear = splitList[1]

                // Adding Test Event //
                TestTimelineGovernment(
                    resultKey,
                    splitListYear,
                    splitListSubject,
                    subjectVM,
                    governmentQuestionR,
                    getSelectedOptionR,
                    finailResult,
                    questionTitleKey,
                    questionRoute
                )

                // Adding Studying Event //
                StudyTimeline(resultKey, splitListYear, splitListSubject, subjectVM)

                DisplayAlertDialog(
                    openDialog = openDialog,
                    closeDialog = { openDialog = false},
                    onYesClickedStudy = {
                        resultKey = 1
                        onYesClickStudy()
                    },
                    onYesClickedTest = {
                        if(studyOrTestKeyValue == Constants.SHOWANSWERFORTEST){
                            onYesClickStudy()
                        }
                        resultKey = 2
                        onYesClickTest()
                    },
                    studyOrTestKey = studyOrTestKeyValue
                )
                StudyTopBar(
                    onEndQuizClick = {
                        openDialog = true
                    },
                    hours = subjectVM.hoursEng,
                    minutes = subjectVM.minutesEng,
                    seconds = subjectVM.secondsEng,
                    studyOrTestState = studyOrTestKeyValue,
                    questionTitle = questionTitle,
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
                    questionSize = questionSize.toString(),
                    studyOrTestState = studyOrTestKeyValue,
                    onSaveIconClick = {
                        subjectVM.addSaveQuestion()
                        scope.launch {
                            snackbarHostStateForSaveQuestion.showSnackbar("Successfully Added To Save Question List")
                        }
                    },
                    onShowAnswerIconClick = {
                        if (!expandedState) {
                            if (correctOption != null) {
                                correctOptionColor = correctOption
                            }


                        }
                        expandedState = !expandedState
                    },
                    onShowAnswerClick = {
                        if (!expandedState) {
                            if (correctOption != null) {
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
                        if (currentQuestion != null &&
                            endQuestion != null && underline != null
                        ) {
                            CurrentQuestion {
                                EnglishQuestion(
                                    question = currentQuestion,
                                    underline = underline,
                                    endLine = endQuestion
                                )
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
                        }else{
                            currentIndex--

                        }
                    },
                    onNextBtClick = {
                        if (currentIndex == questionSize?.minus(1) ){
                            Toast.makeText(context, "Last Question", Toast.LENGTH_SHORT).show()
                        }else if(expandedState){
                            expandedState = false
                            currentIndex++
                        } else {
                            currentIndex++

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


    when(studyOrTestKeyValue){
        Constants.SELECTED_STUDY_KEY -> {
            ComposableLifecycle{ source, event ->
                when(event){
                    Lifecycle.Event.ON_PAUSE -> {
                        Toast.makeText(context, "On Pause", Toast.LENGTH_SHORT).show()
                        subjectVM.pauseStudy()}
                    Lifecycle.Event.ON_RESUME -> {
                        Toast.makeText(context, "On Resume", Toast.LENGTH_SHORT).show()
                        subjectVM.startForStudy()}
                    else -> {}
                }
            }
        }
    }
}

