package com.pktech.presentation.screens.subjects.maths.year.math2012

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LiveData
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.repository.UiRepository
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.presentation.screens.subjects.eng.uiItems.CurrentAnswer
import com.pktech.presentation.screens.subjects.eng.uiItems.CurrentOption
import com.pktech.presentation.screens.subjects.eng.uiItems.CurrentQuestion
import com.pktech.presentation.screens.subjects.eng.uiItems.Option
import com.pktech.presentation.screens.subjects.items.StudyObjUIItems
import com.pktech.presentation.screens.subjects.items.StudyTopBar
import com.pktech.presentation.screens.subjects.maths.uiItems.DisplayAlertDialog
import kotlinx.coroutines.flow.collectLatest


@SuppressLint("CoroutineCreationDuringComposition", "StateFlowValueCalledInComposition",
    "UnrememberedMutableState"
)
@Composable
fun Math2012ObjStudy(
    onYesClickStudy: () -> Unit,
    onYesClickTest: () -> Unit,
) {

    val context = LocalContext.current
    val subjectVM: SubjectVM = hiltViewModel()
    val uiRepository = UiRepository()
    val studyOrTestKey = StudyOrTestKey(context)
    val scope = rememberCoroutineScope()


    
    val studyOrTestKeyValue = studyOrTestKey.getKey.collectAsState(initial = "")
    val getAllImage by subjectVM.getAllImageDB.observeAsState(listOf())
    val getAllImageR = subjectVM.getAllImageDB.value

    val getAllSubject by subjectVM.getAllSubjectDB.observeAsState(listOf())
    val getAllSubjectR = subjectVM.getAllSubjectDB.value


    getAllImage::class.java
    getAllSubject::class.java


    var currentIndex by remember { mutableStateOf(0) }

    val questionIndex = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.id
    val currentQuestion = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.question
    val mainOptionA = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.optionA
    val mainOptionB = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.optionB
    val mainOptionC = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.optionC
    val mainOptionD = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.optionD
    val answer = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.answer
    val currentInstructions = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.instructions
    val currentImage = getAllSubjectR?.get(1)?.subject?.get(0)?.get(currentIndex)?.objective?.image



    val alphabetOptionA = uiRepository.alphabetOptions[currentIndex].options[0]
    val alphabetOptionB = uiRepository.alphabetOptions[currentIndex].options[1]
    val alphabetOptionC = uiRepository.alphabetOptions[currentIndex].options[2]
    val alphabetOptionD = uiRepository.alphabetOptions[currentIndex].options[3]



    val getSelectedOption by subjectVM.getSelectedOption.observeAsState(listOf())
    val getSelectedOptionR = subjectVM.getSelectedOption.value
    getSelectedOption::class.java


    var selectedOptionState by remember { mutableStateOf("") }
    val currentSelectedOption = getSelectedOptionR?.get(currentIndex)?.selectedOption
    val currentSelectedOptionId = getSelectedOptionR?.get(currentIndex)?.id

    if (currentSelectedOption != null) {
        selectedOptionState  =  currentSelectedOption

    }
    Log.i(TAG, "Math2012ObjStudy: $currentSelectedOption")


    var expandedState by remember { mutableStateOf(false)}
    var bookmarkState by remember { mutableStateOf(false) }
    var openDialog by remember { mutableStateOf(false)}

    LaunchedEffect(key1 = true){
        subjectVM.start()
//        subjectVM.sharedFlow.collectLatest {
//            optiondb = it
//        }


    }



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
                seconds = subjectVM.seconds
            )
        }
    ) {


        if (currentInstructions != null && questionIndex != null) {
            StudyObjUIItems(
                instructions = currentInstructions,
                questionSize = getAllSubjectR[1].subject[0].size.toString(),
                studyOrTestState = studyOrTestKeyValue.value,
                onSaveIconClick = {
                    bookmarkState = !bookmarkState
                },
                bookmarkState = bookmarkState,
                onShareIconClick = { },
                onShowAnswerIconClick = { expandedState = !expandedState },
                onShowAnswerClick = {expandedState = !expandedState },
                expandedState = expandedState,
                currentAnswer = {
                    if (answer != null) {
                        CurrentAnswer(answer = answer)
                    }
                },
                questionIndex = questionIndex,
                currentQuestion = {
                    if (getAllImageR != null) {
                            if ((currentImage != null) && (currentQuestion != null) ) {
                                CurrentQuestion(
                                    question = currentQuestion,
//                                    imageUrl = currentImage,
//                                    bitmap = getAllImageR.get(currentIndex).bitmap.asImageBitmap()
                                )
                            }
                    }
                },
                onGotoQuestionNoClick = {


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
                        Option(
                            selectedOptionDB = currentSelectedOption,
                            alphabetOption = alphabetOptionA,
                            onOptionClick = {
                                selectedOptionState = alphabetOptionA
                                val updatedSelectedOptionA =
                                    SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionA)


//                                Log.e(TAG, "Math2012ObjStudy: updatedSelectedOptionA  $updatedSelectedOptionA }")

                            },
                            currentOption = {
                                if (mainOptionA != null) {
                                    CurrentOption(
                                        option = mainOptionA,
                                        color = when(selectedOptionState){
                                            alphabetOptionA -> Color.White
                                            else -> {
                                                Color.Black
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                },
                optionB = {
                    if (currentSelectedOption != null && currentSelectedOptionId != null) {
                        Option(
                            selectedOptionDB = currentSelectedOption,
                            alphabetOption = alphabetOptionB,
                            onOptionClick = {
                                selectedOptionState = alphabetOptionB
                                    val updatedSelectedOptionB =
                                        SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                        subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionB)
//                                Log.e(TAG, "Math2012ObjStudy: updatedSelectedOptionB  $updatedSelectedOptionB }")


                            },
                            currentOption = {
                                if (mainOptionB != null) {
                                    CurrentOption(
                                        option = mainOptionB,
                                        color = when(currentSelectedOption){
                                            alphabetOptionB -> Color.White
                                            else -> {
                                                Color.Black
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                },
                optionC = {
                    if (currentSelectedOption != null && currentSelectedOptionId != null) {
                        Option(
                            selectedOptionDB = currentSelectedOption,
                            alphabetOption = alphabetOptionC,
                            onOptionClick = {
                                selectedOptionState = alphabetOptionC
                                val updatedSelectedOptionC =
                                    SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                    subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionC)
//                                Log.e(TAG, "Math2012ObjStudy: updatedSelectedOptionB  $updatedSelectedOptionC }")

                            },
                            currentOption = {
                                if (mainOptionC != null) {
                                    CurrentOption(
                                        option = mainOptionC,
                                        color = when(selectedOptionState){
                                            alphabetOptionC -> Color.White
                                            else -> {
                                                Color.Black
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                },
                optionD = {
                    if (currentSelectedOption != null && currentSelectedOptionId != null) {
                        Option(
                            selectedOptionDB = currentSelectedOption,
                            alphabetOption = alphabetOptionD,
                            onOptionClick = {
                                selectedOptionState = alphabetOptionD
                                val updatedSelectedOptionD =
                                    SelectedOptionDB( currentSelectedOptionId, selectedOptionState)
                                    subjectVM.addUpdateOptions(updateOptions = updatedSelectedOptionD)
//                                Log.e(TAG, "Math2012ObjStudy: updatedSelectedOptionB  $updatedSelectedOptionD }")

                            },
                            currentOption = {
                                if (mainOptionD != null) {
                                    CurrentOption(
                                        option = mainOptionD,
                                        color = when(selectedOptionState){
                                            alphabetOptionD -> Color.White
                                            else -> {
                                                Color.Black
                                            }
                                        }
                                    )
                                }
                            }
                        )
                    }
                },
            )
        }

    }
}

