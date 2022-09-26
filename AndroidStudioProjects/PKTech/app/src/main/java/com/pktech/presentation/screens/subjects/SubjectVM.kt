package com.pktech.presentation.screens.subjects

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.ImageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.pktech.data.local.entity.Subjects
import com.pktech.data.repository.AllSubjectRepo
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.flow.*
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.time.Duration
import kotlin.time.ExperimentalTime


@OptIn(ExperimentalTime::class)
@HiltViewModel
class SubjectVM @Inject constructor(
   val repository: QuestionsRepository
):ViewModel() {


    var getAllImageDB: LiveData<List<ImageDB>> = repository.getAllImage()
    var getAllSubjectDB: LiveData<List<Subjects>> = repository.getAllSubjects()
    var getSelectedOption: LiveData<List<SelectedOptionDB>> = repository.getSelectedOption()

    private val _shareFlow = MutableSharedFlow<List<SelectedOptionDB>>()
    val sharedFlow = _shareFlow.asSharedFlow()

    private val _stateFlow = MutableStateFlow<List<SelectedOptionDB>>(listOf())
    val stateFlow = _stateFlow.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getSelectedOptionFLow().collect{
                _stateFlow.value = it
            }
        }
        getSelectedOption = repository.getSelectedOption()
        getAllSubjectDB = repository.getAllSubjects()
        getAllImageDB = repository.getAllImage()
    }

    private var time: Duration = Duration.parse("1h")
    private lateinit var timer: Timer

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


    suspend fun addingAllImage(context: Context){
        val imageDBList = listOf<ImageDB>(
            ImageDB(
                bitmap = getBitmap(context),
                id = 1
            ),
            ImageDB(
                bitmap = getBitmap(context),
                id = 2
            )
        )
        addAllImage(allImage = imageDBList)

    }



    suspend fun addAllImage(allImage: List<ImageDB>) {
        repository.addAllImage(allImage = allImage)
    }

    private suspend fun getBitmap(context: Context): Bitmap {
        val loading = ImageLoader(context)
        val request = ImageRequest.Builder(context)
            .data("https://waecq.herokuapp.com/image/test.png")
            .build()
        val result = (loading.execute(request) as SuccessResult).drawable

        return (result as BitmapDrawable).bitmap
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

