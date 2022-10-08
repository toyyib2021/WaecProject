package com.pktech.presentation.screens.dashboard


import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.remote.QuestionsAPI
import com.pktech.data.repository.AllImage
import com.pktech.data.repository.AllSubjectRepo
import com.pktech.data.repository.UiRepository
import com.pktech.data.repository.account.AccountAllYear
import com.pktech.data.repository.maths.MathsAllYear

import com.pktech.domain.model.UiDataClass
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.MathRepository
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

val homeStudyAndTest = UiRepository()

@HiltViewModel
class DashboardVM @Inject constructor(
    val repository: QuestionsRepository,
//    val api: QuestionsAPI,
    val mathsRepositoryw: MathRepository,
    val accountRepositoryw: AccountRepository,
    ): ViewModel() {

    private val uiRepository = UiRepository()
    private val allSubjectRepo = AllSubjectRepo()

    init {
        deleteAllSelectedOption()

    }

    var selectedTab by mutableStateOf(0)
    var isLoading by mutableStateOf(1)

    var isActiveState by mutableStateOf("Active")
    var isCancelledState by mutableStateOf("Cancelled")
    var isCompletedState by mutableStateOf("Completed")

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    private val _questionState = mutableStateOf(AddAllSubjectState())
    val questionState: State<AddAllSubjectState> = _questionState

    private val allImage = AllImage()
    private val mathsAllYear = MathsAllYear()
    private val accountAllYear = AccountAllYear()

    fun addAllSubjectsAndImage(context: Context) {
        val job =  viewModelScope.launch(Dispatchers.IO) {
            try {
                isLoading = 2
                mathsRepositoryw.deleteAll()
                repository.deleteAllImage()
                delay(5000)
                addingAllImage(context = context)
                mathsRepositoryw.addMaths(addMaths = mathsAllYear.mathsAllYear())
               accountRepositoryw.addAccount(addMath = accountAllYear.accountAllYear())

            } catch (e: IOException){
                Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                Toast.makeText(context, "no internet connection", Toast.LENGTH_SHORT).show()


            } catch (e: HttpException){
                Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                Toast.makeText(context, "something went wrong", Toast.LENGTH_SHORT).show()

            }

        }.status()
        Log.i(ContentValues.TAG, "addAllSubjectsAndImage: $job")
        if (job == isCompletedState){
            isLoading = 1
        }

    }


    fun Job.status(): String = when{
        isActive -> isActiveState
        isCancelled -> isCancelledState
        isCompleted -> isCompletedState
        else -> ""
    }


    private fun addingAllImage(context: Context) {
        viewModelScope.launch {
            repository.addAllImage(allImage = allImage.addingAllImage(context = context))
        }

    }


//    fun deleteAndUpdateAllSubjectsTest(
//        context: Context,
//        errorMsgHTP: String,
//        errorMsgIOException: String
//    ) {

//        viewModelScope.launch {
//            try {
//                isLoading = 2
//
//                repository.deleteAll()
//                delay(5000)
//                repository.addAllSubjects(allSubject = api.getAllQuestion())
//                isLoading = 1
//
//            } catch (e: HttpException) {
//                Log.e("DashboardVM", "deleteAllSubjectsTest: $e ", )
//                isLoading = 1
//                Toast.makeText(context, "something went wrong", Toast.LENGTH_SHORT).show()
//
//
//
//            } catch (e: IOException) {
//                Log.e("DashboardVM", "deleteAllSubjectsTest: $e ",)
//                isLoading = 1
//                Toast.makeText(context, "no internet connection $e", Toast.LENGTH_SHORT).show()
//
//            }
//
//        }

//    }





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
