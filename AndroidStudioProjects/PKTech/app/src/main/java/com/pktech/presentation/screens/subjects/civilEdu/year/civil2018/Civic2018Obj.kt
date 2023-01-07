package com.pktech.presentation.screens.subjects.civilEdu.year.civil2018

import android.annotation.SuppressLint
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
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import androidx.core.math.MathUtils
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.Agriculture
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.utill.QuestionTitleKey
import com.pktech.data.repository.UiRepository
import com.pktech.domain.model.UiDataClass
import com.pktech.navigation.screens.CivicEduObjYear
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2014.CivicEdu2014VM
import com.pktech.presentation.screens.subjects.eng.year.eng2012.items.EnglishQuestion
import com.pktech.presentation.screens.subjects.items.*
import com.pktech.presentation.screens.subjects.questionIndexSheetRepo
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.Constants
import com.pktech.utill.SaveQuestionConstants
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Civic2018Obj(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
){
    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val civicEduVM: CivicEdu2018VM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val questionTitleKey = QuestionTitleKey(context)
    val scope = rememberCoroutineScope()
    val questionTitle = SaveQuestionConstants.CIVICEDU2018
    val questionRoute = CivicEduObjYear.Obj2018.route

    val getSelectedOption by subjectVM.getSelectedOption.observeAsState(listOf())
    val getSelectedOptionR = subjectVM.getSelectedOption.value
    getSelectedOption::class.java

    val civicEduQuestion by civicEduVM.getCivicEdu2018.observeAsState(listOf<Agriculture>())
    val civicEduQuestionR = civicEduVM.getCivicEdu2018.value
    civicEduQuestion::class.java

    val getSelectedOptionCol by subjectVM.getSelectedOptionCol.observeAsState(listOf())
    val getSelectedOptionColR = subjectVM.getSelectedOptionCol.value
    getSelectedOptionCol::class.java

    // bottomSheet 1 - 100, bottomSheet 1 - 80, bottomSheet 1 - 60, bottomSheet1to100 1 - 50 //
    val bottomSheetList = getSelectedOptionColR?.let { questionIndexSheetRepo(it) }
    val questionSize = civicEduQuestionR?.civic?.size

    val studyOrTestKeyState = studyOrTestKey.getKey.collectAsState(initial = "")
    val studyOrTestKeyValue = studyOrTestKeyState.value
    val questionTitleKeyState = questionTitleKey.getKey.collectAsState(initial = "")
    val questionTitleKeyValue = questionTitleKeyState.value

    var currentIndex by remember { mutableStateOf(0) }


    val questionIndex = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.id
    val currentQuestion = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.question
    val mainOptionA = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.optionA
    val mainOptionB = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.optionB
    val mainOptionC = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.optionC
    val mainOptionD = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.optionD
    val answer = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.explanation
    val currentInstructions = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.instructions
    val correctOption = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.correctOption
    val underline = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.questionUnderline
    val endQuestion = civicEduQuestionR?.civic?.get(currentIndex)?.objective?.questionEnd


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
                TestTimelineCivicEdu(
                    resultKey,
                    splitListYear,
                    splitListSubject,
                    subjectVM,
                    civicEduQuestionR,
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

