package com.pktech.presentation.screens.subjects

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.*
import coil.ImageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.pktech.data.local.entity.Subjects
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.Maths
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.repository.AllImage
import com.pktech.data.repository.UiRepository
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.pktech.domain.model.Questions
import com.pktech.domain.repository.MathRepository
import com.pktech.presentation.screens.list.ListUiState
import kotlinx.coroutines.flow.*
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.time.Duration
import kotlin.time.ExperimentalTime


@OptIn(ExperimentalTime::class)
@HiltViewModel
class SubjectVM @Inject constructor(
   val repository: QuestionsRepository,
):ViewModel() {

    val uiRepository = UiRepository()

    private val _emptyCorrectOption = MutableStateFlow(uiRepository.correctOptionList)
    val emptyCorrectOption: StateFlow<List<SelectedOptionDB>> = _emptyCorrectOption.asStateFlow()


    var getSelectedOption: LiveData<List<SelectedOptionDB>> = repository.getSelectedOption()
    var getSelectedOptionCol: LiveData<List<String>> = repository.getOptionsCol()



    private var time: Duration = Duration.parse("1h")
    private lateinit var timer: Timer

//    var bitmap = mutableStateOf(ImageDB(id = "", null))

    var seconds by mutableStateOf("00")
    var minutes by mutableStateOf("00")
    var hours by mutableStateOf("00")
    var isPlaying by mutableStateOf(false)



    fun start() {
        timer = fixedRateTimer(initialDelay = 1000L, period = 1000L) {
            time = time.minus(Duration.seconds(1))
            updateTimeStates()
        }
        isPlaying = true
    }

    private fun updateTimeStates() {
        time.toComponents { hours, minutes, seconds, _ ->
            this@SubjectVM.seconds = seconds.pad()
            this@SubjectVM.minutes = minutes.pad()
            this@SubjectVM.hours = hours.pad()
        }
    }

    private fun Int.pad(): String {
        return this.toString().padStart(2, '0')
    }

    fun pause() {
        timer.cancel()
        isPlaying = false
    }

    fun stop() {
        pause()
        time = Duration.ZERO
        updateTimeStates()
    }

     fun addUpdateOptions(updateOptions: SelectedOptionDB){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUpdateOptions(updateOptions = updateOptions)
        }
    }
}

private fun Long.pad(): String {

    return this.toString().padStart(2, '0')
}

