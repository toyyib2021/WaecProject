import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.English
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.utill.QuestionTitleKey
import com.pktech.data.repository.UiRepository
import com.pktech.navigation.screens.EnglishObjYear
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.eng.year.eng2012.English2012VM
import com.pktech.presentation.screens.subjects.eng.year.eng2012.items.EnglishQuestion
import com.pktech.presentation.screens.subjects.items.*
import com.pktech.presentation.screens.subjects.questionIndexSheetRepoEng
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.Constants
import com.pktech.utill.Constants.SELECTED_STUDY_KEY
import com.pktech.utill.Constants.SELECTED_TEST_KEY
import com.pktech.utill.Constants.SHOWANSWERFORTEST
import com.pktech.utill.SaveQuestionConstants
import kotlinx.coroutines.launch
import java.text.DateFormat
import java.util.*
import javax.annotation.meta.When

@SuppressLint("StateFlowValueCalledInComposition", "UnrememberedMutableState",
    "MutableCollectionMutableState"
)
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Eng2012Obj(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
){

    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val english2012VM: English2012VM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val questionTitleKey = QuestionTitleKey(context)
    val scope = rememberCoroutineScope()
    val questionTitle = SaveQuestionConstants.ENGLISH2012
    val questionRoute = EnglishObjYear.Obj2012.route




    val studyOrTestKeyState = studyOrTestKey.getKey.collectAsState(initial = "")
    val studyOrTestKeyValue = studyOrTestKeyState.value
    val questionTitleKeyState = questionTitleKey.getKey.collectAsState(initial = "")
    val questionTitleKeyValue = questionTitleKeyState.value


    val english2012 by english2012VM.getEnglish2012.observeAsState(listOf<English>())
    val english2012R = english2012VM.getEnglish2012.value
    english2012::class.java

    var currentIndex by remember { mutableStateOf(0) }


    val questionIndex = english2012R?.english?.get(currentIndex)?.objective?.id
    val currentQuestion = english2012R?.english?.get(currentIndex)?.objective?.question
    val mainOptionA = english2012R?.english?.get(currentIndex)?.objective?.optionA
    val mainOptionB = english2012R?.english?.get(currentIndex)?.objective?.optionB
    val mainOptionC = english2012R?.english?.get(currentIndex)?.objective?.optionC
    val mainOptionD = english2012R?.english?.get(currentIndex)?.objective?.optionD
    val answer = english2012R?.english?.get(currentIndex)?.objective?.explanation
    val currentInstructions = english2012R?.english?.get(currentIndex)?.objective?.instructions
    val correctOption = english2012R?.english?.get(currentIndex)?.objective?.correctOption
    val underline = english2012R?.english?.get(currentIndex)?.objective?.questionUnderline
    val endQuestion = english2012R?.english?.get(currentIndex)?.objective?.questionEnd


    subjectVM.addSaveQuestionData.value.questionTitle = SaveQuestionConstants.ENGLISH2012

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
    var openDialog by remember { mutableStateOf(false) }
    var openInstruction by remember { mutableStateOf(false) }
    var expandedState by remember { mutableStateOf(false) }


    val snackbarHostStateForSaveQuestion = remember { SnackbarHostState() }
//    LaunchedEffect(key1 = bookmark){
//        if (bookmark == "A"){
//            bookmarkState = subjectVM.bookmarkState2[currentIndex]
//        }
//    }







    val snackbarHostState = remember { SnackbarHostState() }


        LaunchedEffect(key1 = subjectVM.minutesEng, key2 = subjectVM.secondsEng){
            if (subjectVM.minutesEng == "05" && subjectVM.secondsEng == "00" ){
                scope.launch {
                    snackbarHostState.showSnackbar("You have five minute left")
                }
            } else if (subjectVM.minutesEng == "01" && subjectVM.secondsEng == "00" ){
                scope.launch {
                    snackbarHostState.showSnackbar("You have one minute left")
                }
            }
            else if (subjectVM.minutesEng == "00" && subjectVM.secondsEng == "02" ){
                scope.launch {
                    snackbarHostState.showSnackbar("TIME UP")
                }
            } else if (subjectVM.minutesEng == "00" && subjectVM.secondsEng == "-5" ){
                onYesClickTest()
            }
        }


    LaunchedEffect(key1 = studyOrTestKeyValue){
        when(studyOrTestKeyValue){
            SELECTED_TEST_KEY -> subjectVM.startEng()
//            SELECTED_STUDY_KEY -> subjectVM.startForStudy()
        }
//        if (studyOrTestKeyValue == Constants.SELECTED_TEST_KEY){
//            subjectVM.startEng()
//        } else{
//            subjectVM.startForStudy()
//        }

    }

    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )


    BackHandlerFun(backHandler = { openDialog = true })
    var correctOptionStudyState = ""
    val correctOptionColourState = "A"
    var correctOptionColor = ""
    var correctOptionColorTest by remember { mutableStateOf("D") }


    when(studyOrTestKeyValue){
        SHOWANSWERFORTEST -> {
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
                            .background(White)) {

                        getSelectedOptionColR?.let {
                            questionIndexSheetRepoEng(
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
                var resultKey by remember { mutableStateOf(0)}
                var finailResult by remember { mutableStateOf(0)}
                val splitList = questionTitle.split(" ")
                val splitListSubject = splitList[0]
                val splitListYear = splitList[1]

                // Adding Test Event //
                LaunchedEffect(key1 = resultKey){
                    if(resultKey == 2){
                        val timeAndDate: Date = Calendar.getInstance().time
                        val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
                        val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

                        val year = splitListYear
                        val subject = splitListSubject

                        subjectVM.addTestTimeline.value.year = year
                        subjectVM.addTestTimeline.value.subject = subject
                        subjectVM.addTestTimeline.value.date = formatedDate
                        subjectVM.addTestTimeline.value.time = formatedTime

                        var index = 0
                        var result = 0
                        if (english2012R != null) {
                            val correctOption2 = english2012R.english.get(index).objective.correctOption
                            val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                            while (index < english2012R.english.size){
                                if (english2012R.english.get(index).objective.correctOption ==
                                    getSelectedOptionR?.get(index)?.selectedOption){
                                    finailResult++
                                }
                                index++
                            }
                            Log.i(TAG, "result: $selectedOption")
                            Log.i(TAG, "result: $correctOption2")
                            Log.i(TAG, "finailResult: ${finailResult}")
                            Log.i(TAG, "result: $index")
                        }

                        if (english2012R != null) {
                            subjectVM.addTestTimeline.value.testResult = "$finailResult / ${english2012R.english.size}"
                            questionTitleKey.saveKey("${english2012R.english.size} $finailResult $questionRoute")

                        }

                        subjectVM.addTestTimeline()
                    }
                }

                // Adding Studying Event //
                LaunchedEffect(key1 = resultKey){
                    if (resultKey == 1){
                        val timeAndDate: Date = Calendar.getInstance().time
                        val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
                        val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

                        val year = splitListYear
                        val subject = splitListSubject
                        val hoursOfStudy = subjectVM.hoursStudy
                        val minutesOfStudy = subjectVM.minutesStudy

                        subjectVM.addStudyTimeline.value.year = year
                        subjectVM.addStudyTimeline.value.subject = subject
                        subjectVM.addStudyTimeline.value.date = formatedDate
                        subjectVM.addStudyTimeline.value.studyHours = hoursOfStudy
                        subjectVM.addStudyTimeline.value.studyMinis = minutesOfStudy
                        subjectVM.addStudyTimeline.value.time = formatedTime

                        subjectVM.addStudyTimeline()

                    }
                }

                DisplayAlertDialog(
                    openDialog = openDialog,
                    closeDialog = { openDialog = false},
                    onYesClickedStudy = {
                        resultKey = 1
                        onYesClickStudy()
                    },
                    onYesClickedTest = {
                        if(studyOrTestKeyValue == SHOWANSWERFORTEST){
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
                        questionSize = english2012R.english.size.toString(),
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
                            if (currentIndex == 99){
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
        SELECTED_STUDY_KEY -> {
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
//    ComposableLifecycle{ source, event ->
//        when(event){
//            Lifecycle.Event.ON_PAUSE -> {
//                subjectVM.pause()}
//            Lifecycle.Event.ON_RESUME -> {
//                subjectVM.start()}
//        }
//    }



}

@Composable
fun ComposableLifecycle(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    onEvent: (LifecycleOwner, Lifecycle.Event) -> Unit
){
    DisposableEffect(key1 = lifecycleOwner){
        val observer = LifecycleEventObserver{source, event ->
            onEvent(source, event)
        }
        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }
}