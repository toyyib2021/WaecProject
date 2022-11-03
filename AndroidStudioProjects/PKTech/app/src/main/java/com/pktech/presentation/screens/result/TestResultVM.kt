package com.pktech.presentation.screens.result

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.repository.UiRepository
import com.pktech.domain.repository.QuestionsRepository
import com.pktech.domain.repository.SaveQuestionRepository
import com.pktech.utill.Constants.COMPLETE
import com.pktech.utill.Constants.LOADING
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TestResultVM @Inject constructor(
    val repository: QuestionsRepository
): ViewModel() {

    private val uiRepository = UiRepository()

    var restartQuestionState by mutableStateOf("")
     fun deleteAllSelectedOption() {
         kotlin.run {
             val job = viewModelScope.launch(Dispatchers.IO) {
                 restartQuestionState = LOADING
                 repository.deleteAllSelectedOption()
                 delay(1000)
                 repository.addEmptyOptions(emptyOptions = uiRepository.emptySelectedOptionList)
             }

             job.invokeOnCompletion {
                 restartQuestionState = COMPLETE
             }
         }
    }

}