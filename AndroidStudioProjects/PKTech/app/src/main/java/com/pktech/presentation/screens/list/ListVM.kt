package com.pktech.presentation.screens.list


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.repository.UiRepository
import com.pktech.data.repository.Years

import com.pktech.domain.model.UiDataClass
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject



class ListVM(): ViewModel() {



    init {
//        addEmptyOptions()
    }


    var selectedTab by mutableStateOf(0)
    var selectedSubject by mutableStateOf("")

    private val _uiState = MutableStateFlow(ListUiState())
    val uiState: StateFlow<ListUiState> = _uiState.asStateFlow()



}
val homeStudyAndTest = UiRepository()

data class ListUiState(
    var subjects: List<UiDataClass> = homeStudyAndTest.subjects,
    var years: List<Years> = homeStudyAndTest.years,
    var saveQuestionData: List<SaveQuestionData> = listOf()
)
