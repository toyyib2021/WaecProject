package com.pktech.presentation.screens.dashboard


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.repository.AllSubjectRepo
import com.pktech.data.repository.UiRepository

import com.pktech.domain.model.UiDataClass
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

val homeStudyAndTest = UiRepository()

@HiltViewModel
class DashboardVM @Inject constructor(
    val repository: QuestionsRepository
    ): ViewModel() {

    private val uiRepository = UiRepository()
    private val allSubjectRepo = AllSubjectRepo()

    init {

        deleteAllSelectedOption()

    }

    var selectedTab by mutableStateOf(0)
    var isLoading by mutableStateOf(1)

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    private val _questionState = mutableStateOf(AddAllSubjectState())
    val questionState: State<AddAllSubjectState> = _questionState


    fun deleteAllSubjectsTest() {

          try {
              isLoading = 2
            viewModelScope.launch {
                repository.deleteAll()
                delay(5000)
                repository.addAllSubjects(allSubject = allSubjectRepo.allSubjectRepo)
                isLoading = 1
            }

        }catch (e: Exception){
            Log.e("DashboardVM", "deleteAllSubjectsTest: ", e)
              isLoading = 1
        }

    }


    fun deleteAllSubjects() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
            delay(5000)
            repository.addAllSubjects(allSubject = allSubjectRepo.allSubjectRepo)
        }

    }


    private fun deleteAllSelectedOption() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllSelectedOption()
            delay(1000)
            repository.addEmptyOptions(emptyOptions = uiRepository.emptySelectedOptionList)

        }

    }


}

data class DashboardUiState(
    var homeStudyAndTestState: List<UiDataClass> = homeStudyAndTest.uiDataClassRepos,
    var saveQuestionAndOthers: List<UiDataClass> = homeStudyAndTest.saveQuestionAndOthers
)

data class AddAllSubjectState(
    val allSubjects: () -> Unit = {} ,
    val isLoading: Boolean = false
)
