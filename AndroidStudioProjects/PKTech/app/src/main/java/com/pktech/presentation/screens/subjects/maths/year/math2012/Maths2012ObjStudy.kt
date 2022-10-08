package com.pktech.presentation.screens.subjects.maths.year.math2012

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
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.Maths
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.repository.UiRepository
import com.pktech.presentation.screens.subjects.QuestionIndexSheet
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.items.StudyObjUIItems
import com.pktech.presentation.screens.subjects.items.StudyTopBar
import com.pktech.presentation.screens.subjects.items.DisplayAlertDialog
import com.pktech.presentation.screens.subjects.maths.year.math2012.items.*
import com.pktech.presentation.screens.subjects.questionIndexSheetRepo
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.SaveQuestionConstants.MATHS2012
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("CoroutineCreationDuringComposition", "StateFlowValueCalledInComposition",
    "UnrememberedMutableState"
)
@Composable
fun Math2012Obj(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,

) {

    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val math2012VM: Math2012VM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val scope = rememberCoroutineScope()




    val studyOrTestKeyValue = studyOrTestKey.getKey.collectAsState(initial = "")


    val getCImage1 by math2012VM.getImage1.observeAsState(listOf<ImageDB>())
    val getCImage2 by math2012VM.getImage2.observeAsState(listOf<ImageDB>())
    val getCImage3 by math2012VM.getImage3.observeAsState(listOf<ImageDB>())
    val getCImage4 by math2012VM.getImage4.observeAsState(listOf<ImageDB>())
    val getCImage5 by math2012VM.getImage5.observeAsState(listOf<ImageDB>())
    val getCImage6 by math2012VM.getImage6.observeAsState(listOf<ImageDB>())
    val getCImage7 by math2012VM.getImage7.observeAsState(listOf<ImageDB>())
    val getCImage8 by math2012VM.getImage8.observeAsState(listOf<ImageDB>())
    val getCImage9 by math2012VM.getImage9.observeAsState(listOf<ImageDB>())
    val getCImage10 by math2012VM.getImage10.observeAsState(listOf<ImageDB>())
    val getCImage11 by math2012VM.getImage11.observeAsState(listOf<ImageDB>())
    val getCImage12 by math2012VM.getImage12.observeAsState(listOf<ImageDB>())
    val getCImage13 by math2012VM.getImage13.observeAsState(listOf<ImageDB>())

    val getCurrentImage1 = math2012VM.getImage1.value?.bitmap
    val getCurrentImage2 = math2012VM.getImage2.value?.bitmap
    val getCurrentImage3 = math2012VM.getImage3.value?.bitmap
    val getCurrentImage4 = math2012VM.getImage4.value?.bitmap
    val getCurrentImage5 = math2012VM.getImage5.value?.bitmap
    val getCurrentImage6 = math2012VM.getImage6.value?.bitmap
    val getCurrentImage7 = math2012VM.getImage7.value?.bitmap
    val getCurrentImage8 = math2012VM.getImage8.value?.bitmap
    val getCurrentImage9 = math2012VM.getImage9.value?.bitmap
    val getCurrentImage10 = math2012VM.getImage10.value?.bitmap
    val getCurrentImage11 = math2012VM.getImage11.value?.bitmap
    val getCurrentImage12 = math2012VM.getImage12.value?.bitmap
    val getCurrentImage13 = math2012VM.getImage13.value?.bitmap

    getCImage1::class.java
    getCImage2::class.java
    getCImage3::class.java
    getCImage4::class.java
    getCImage5::class.java
    getCImage6::class.java
    getCImage7::class.java
    getCImage8::class.java
    getCImage9::class.java
    getCImage10::class.java
    getCImage11::class.java
    getCImage12::class.java
    getCImage13::class.java





    val math2012 by math2012VM.getMaths2012.observeAsState(listOf<Maths>())
    val maths2012R = math2012VM.getMaths2012.value
    math2012::class.java

    var currentIndex by remember { mutableStateOf(0) }

    val questionIndex = maths2012R?.maths?.get(currentIndex)?.objective?.id
    val currentQuestion = maths2012R?.maths?.get(currentIndex)?.objective?.question
    val mainOptionA = maths2012R?.maths?.get(currentIndex)?.objective?.optionA
    val mainOptionB = maths2012R?.maths?.get(currentIndex)?.objective?.optionB
    val mainOptionC = maths2012R?.maths?.get(currentIndex)?.objective?.optionC
    val mainOptionD = maths2012R?.maths?.get(currentIndex)?.objective?.optionD
    val answer = maths2012R?.maths?.get(currentIndex)?.objective?.explanation
    val essay = maths2012R?.maths?.get(currentIndex)?.objective?.essay
    val currentInstructions = maths2012R?.maths?.get(currentIndex)?.objective?.instructions
    val correctOption = maths2012R?.maths?.get(currentIndex)?.objective?.correctOption

    Log.i(TAG, "Math2012ObjStudy: currentQuestion: $currentQuestion")




    val alphabetOptionA = uiRepository.alphabetOptions[currentIndex].options[0]
    val alphabetOptionB = uiRepository.alphabetOptions[currentIndex].options[1]
    val alphabetOptionC = uiRepository.alphabetOptions[currentIndex].options[2]
    val alphabetOptionD = uiRepository.alphabetOptions[currentIndex].options[3]


    var emptyCorrectOption = subjectVM.emptyCorrectOption.value.get(currentIndex).selectedOption

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


    var expandedState by remember { mutableStateOf(false)}
    var bookmarkState by remember { mutableStateOf(0) }
    var openDialog by remember { mutableStateOf(false)}

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
                    questionTitle = MATHS2012
                )
            }
        ) {

            if (currentInstructions != null && questionIndex != null) {
                StudyObjUIItems(
                    instructions = currentInstructions,
                    questionSize = maths2012R.maths.size.toString(),
                    studyOrTestState = studyOrTestKeyValue.value,
                    onSaveIconClick = {
                        bookmarkState = 1
                    },
                    bookmarkState = bookmarkState,
                    onShowAnswerIconClick = {
                        if (!expandedState) {
                            if (correctOption != null){
                                emptyCorrectOption = correctOption
                            }

                        }
                        expandedState = !expandedState
                    },
                    onShowAnswerClick = {
                        if (!expandedState) {
                            if (correctOption != null){
                                emptyCorrectOption = correctOption
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
                            if (currentQuestion != null && essay != null) {
                                CurrentQuestionMath2012(
                                    question = currentQuestion,
                                    questionIndex = questionIndex,
                                    essay = essay,
                                    bitmap1 = {
                                        if (getCurrentImage1 != null) {
                                            Maths2012QueImage(
                                                bitmap1 = getCurrentImage1.asImageBitmap()
                                            )
                                        }
                                    },
                                    bitmap2 = {
                                        if (getCurrentImage2 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage2.asImageBitmap()
                                        )

                                    }},
                                    bitmap3 = {if (getCurrentImage3 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage3.asImageBitmap()
                                        )
                                    }},
                                    bitmap4 = {if (getCurrentImage4 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage4.asImageBitmap()
                                        )
                                    }},
                                    bitmap5 = {
                                        if (getCurrentImage5 != null) {
                                            Maths2012QueImage(
                                                bitmap1 = getCurrentImage5.asImageBitmap()
                                            )
                                        }
                                    },
                                    bitmap6 = {if (getCurrentImage6 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage6.asImageBitmap()
                                        )
                                    }},
                                    bitmap7 = {if (getCurrentImage7 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage7.asImageBitmap()
                                        )
                                    }},
                                    bitmap8 = {if (getCurrentImage8 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage8.asImageBitmap()
                                        )
                                    }},
                                    bitmap9 = {if (getCurrentImage9 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage9.asImageBitmap()
                                        )
                                    }},
                                    bitmap10 = {if (getCurrentImage10 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage10.asImageBitmap()
                                        )
                                    }},
                                    bitmap11 = {if (getCurrentImage11 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage11.asImageBitmap()
                                        )
                                    }},
                                    bitmap12 = {if (getCurrentImage12 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage12.asImageBitmap()
                                        )
                                    }},
                                    bitmap13 = {if (getCurrentImage13 != null) {
                                        Maths2012QueImage(
                                            bitmap1 = getCurrentImage13.asImageBitmap()
                                        )
                                    }},

                                )

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
                        if (currentIndex == 49){
                            Toast.makeText(context, "Last Question", Toast.LENGTH_SHORT).show()
                        }else if(expandedState){
                            expandedState = false
                            currentIndex++
                        }else {
                            currentIndex++
                        }
                    },
                    optionA = {
                        if (currentSelectedOption != null  && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                MathsOptions(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionA,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionA
                                        val updatedSelectedOptionA =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionA)

                                    },
                                    currentOption = {
                                        if (mainOptionA != null && essay != null) {
                                            CurrentOptionMathA(
                                                option = mainOptionA,
                                                essay = essay
                                            )
                                        }
                                    },
                                    emptyCorrectOption = emptyCorrectOption
                                )
                                Log.i(TAG, "Math2012ObjStudy: correctOption $emptyCorrectOption")

                            }
                        }
                    },
                    optionB = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                MathsOptions(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionB,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionB
                                        val updatedSelectedOptionB =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionB)
                                    },
                                    currentOption = {
                                        if (mainOptionB != null && essay != null) {
                                            CurrentOptionMathB(
                                                option = mainOptionB,
                                                essay = essay
                                            )
                                        }
                                    },
                                    emptyCorrectOption = emptyCorrectOption
                                )
                            }
                        }
                    },
                    optionC = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                MathsOptions(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionC,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionC
                                        val updatedSelectedOptionC =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionC)
                                    },
                                    currentOption = {
                                        if (mainOptionC != null && essay != null) {
                                            CurrentOptionMathC(
                                                option = mainOptionC,
                                                essay = essay
                                            )
                                        }
                                    },
                                    emptyCorrectOption = emptyCorrectOption
                                )
                            }
                        }
                    },
                    optionD = {
                        if (currentSelectedOption != null && currentSelectedOptionId != null) {
                            if (correctOption != null) {
                                MathsOptions(
                                    selectedOptionDB = currentSelectedOption,
                                    alphabetOption = alphabetOptionD,
                                    onOptionClick = {
                                        selectedOptionState = alphabetOptionD
                                        val updatedSelectedOptionD =
                                            SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionD)
                                    },
                                    currentOption = {
                                        if (mainOptionD != null && essay != null) {
                                            CurrentOptionMathD(
                                                option = mainOptionD,
                                                essay = essay
                                            )
                                        }
                                    },
                                    emptyCorrectOption = emptyCorrectOption
                                )
                            }
                        }
                    },
                )
            }

        }
    }


 }




