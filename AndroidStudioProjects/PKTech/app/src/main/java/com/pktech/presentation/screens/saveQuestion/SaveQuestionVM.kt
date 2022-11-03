package com.pktech.presentation.screens.saveQuestion

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.domain.repository.SaveQuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SaveQuestionVM @Inject constructor(
    private val saveQuestionRepository: SaveQuestionRepository
): ViewModel() {

    var saveQuestionData: List<SaveQuestionData> = listOf()
    private val _getAllSaveQuestion = MutableStateFlow(saveQuestionData)
    val getAllSaveQuestion: StateFlow<List<SaveQuestionData>> = _getAllSaveQuestion.asStateFlow()


    init {

        getAllSaveQuestion()
    }

    private fun getAllSaveQuestion(){
        viewModelScope.launch(Dispatchers.IO) {
            saveQuestionRepository.getAllSaveQuestion().collect{
                _getAllSaveQuestion.value = it
            }
        }

        Log.i(TAG, "addSaveQuestion: ${saveQuestionRepository.getAllSaveQuestion()} ")
    }

    val deleteSaveQuestionData: MutableState<SaveQuestionData> = mutableStateOf(
        SaveQuestionData(
            id = 0,
            questionIndex = "",
            instructions = "",
            question = "",
            answer = "",
            optionA = "",
            optionB = "",
            optionC = "",
            optionD = "",
            questionTitle = "",
            questionEnd = "",
            questionUnderline = ""
        ))

    fun deleteSaveQuestion() {
        viewModelScope.launch(Dispatchers.IO) {
            val deleteSaveQuestionData = deleteSaveQuestionData.value
            saveQuestionRepository.deleteSaveQuestion(deleteSaveQuestion = deleteSaveQuestionData)
        }
    }




}