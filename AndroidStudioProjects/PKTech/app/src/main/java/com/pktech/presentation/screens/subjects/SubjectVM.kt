package com.pktech.presentation.screens.subjects


import android.annotation.SuppressLint
import androidx.compose.runtime.*
import androidx.lifecycle.*
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.entity.StudyTimelineData
import com.pktech.data.local.entity.TestTimelineData
import com.pktech.data.repository.UiRepository
import com.pktech.domain.repository.QuestionsRepository
import com.pktech.domain.repository.SaveQuestionRepository
import com.pktech.domain.repository.StudyTimelineRepository
import com.pktech.domain.repository.TestTimelineRepository
import com.pktech.utill.SaveQuestionConstants.ENGLISH2012
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.flow.*
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.time.Duration
import kotlin.time.ExperimentalTime


@SuppressLint("MutableCollectionMutableState")
@OptIn(ExperimentalTime::class)
@HiltViewModel
class SubjectVM @Inject constructor(
    val repository: QuestionsRepository,
    val saveQuestionRepository: SaveQuestionRepository,
    val studyTimelineRepository: StudyTimelineRepository,
    val testTimelineRepository: TestTimelineRepository
):ViewModel() {

    val uiRepository = UiRepository()

    private val _emptyCorrectOption = MutableStateFlow(uiRepository.correctOptionList)
    val emptyCorrectOption: StateFlow<List<SelectedOptionDB>> = _emptyCorrectOption.asStateFlow()


    var getSelectedOption: LiveData<List<SelectedOptionDB>> = repository.getSelectedOption()
    var getSelectedOptionCol: LiveData<List<String>> = repository.getOptionsCol()



//  ALL SUBJECT TIME VARIABLES FOR TEST//
    var seconds by mutableStateOf("00")
    var minutes by mutableStateOf("00")
    var hours by mutableStateOf("00")
    private var time: Duration = Duration.parse("1h")
    private lateinit var timer: Timer

//  ENGLISH TIME VARIABLES FOR TEST//
    var minutesEng by mutableStateOf("00")
    var secondsEng by mutableStateOf("00")
    var hoursEng by mutableStateOf("00")
    private var timeEng: Duration = Duration.parse("1h 30m")
    private lateinit var timerEng: Timer

//  STUDY TIME VARIABLES//
    var minutesStudy by mutableStateOf("00")
    var secondsStudy by mutableStateOf("00")
    var hoursStudy by mutableStateOf("00")
    private var timeStudy: Duration = Duration.ZERO
    private lateinit var timerStudy: Timer
    var isPlayingStudy by mutableStateOf(false)

    var isPlaying by mutableStateOf(false)

    fun startForStudy() {
        timerStudy = fixedRateTimer(initialDelay = 1000L, period = 1000L) {
            timeStudy = timeStudy.plus(Duration.seconds(1))
            updateTimeStatesForStudy()
        }
        isPlayingStudy = true
    }


    private fun updateTimeStatesForStudy() {
        timeStudy.toComponents { hours, minutes, seconds, _ ->
            this@SubjectVM.secondsStudy = seconds.padStudy()
            this@SubjectVM.minutesStudy = minutes.padStudy()
            this@SubjectVM.hoursStudy = hours.padStudy()
        }
    }
    private fun Int.padStudy(): String {
        return this.toString().padStart(2, '0')
    }

    fun pauseStudy() {
        timerStudy.cancel()
        isPlayingStudy = false
    }

    fun stopStudy() {
        pauseStudy()
        timeStudy = Duration.ZERO
        updateTimeStatesForStudy()
    }



    fun startEng() {
        timerEng = fixedRateTimer(initialDelay = 1000L, period = 1000L) {
            timeEng = timeEng.minus(Duration.seconds(1))
            updateTimeStatesEng()
        }
        isPlaying = true
    }




    private fun updateTimeStatesEng() {
        timeEng.toComponents { hours, minutes, seconds, _ ->
            this@SubjectVM.secondsEng = seconds.padEng()
            this@SubjectVM.minutesEng = minutes.padEng()
            this@SubjectVM.hoursEng = hours.padEng()
        }
    }

    private fun Int.padEng(): String {
        return this.toString().padStart(2, '0')
    }

    fun pauseEng() {
        timerEng.cancel()
        isPlaying = false
    }

    fun stopEng() {
        pauseEng()
        timeEng = Duration.ZERO
        updateTimeStatesEng()
    }

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

//    val addSaveQuestionData: MutableState<SaveQuestionData> = mutableStateOf(
//        SaveQuestionData(
//        id = "", instructions = "", question = "", answer = "", questionTitle = ""
//    ))

    /// INSERTING SAVE QUESTION ////
     val addSaveQuestionData: MutableState<SaveQuestionData> = mutableStateOf(
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
            questionUnderline = "",
            questionEnd = ""
    ))

    fun addSaveQuestion() {
        viewModelScope.launch(Dispatchers.IO) {
            val addSaveQuestionData = addSaveQuestionData.value
            saveQuestionRepository.addSaveQuestion(addSaveQuestion = addSaveQuestionData)
        }
    }

    val addStudyTimeline: MutableState<StudyTimelineData> = mutableStateOf(
        StudyTimelineData(
            id = 0,
            year = "",
            subject = "",
            date = "",
            time = "",
            studyHours = "",
            studyMinis = ""
        ))

    fun addStudyTimeline() {
        viewModelScope.launch(Dispatchers.IO) {
            val addStudyTimeline = addStudyTimeline.value
            studyTimelineRepository.addStudyEvent(studyTimelineData = addStudyTimeline)
        }
    }


    val addTestTimeline: MutableState<TestTimelineData> = mutableStateOf(
        TestTimelineData(
            id = 0,
            year = "",
            subject = "",
            date = "",
            time = "",
            testResult = ""
        ))

    fun addTestTimeline() {
        viewModelScope.launch(Dispatchers.IO) {
            val addTestTimeline = addTestTimeline.value
            testTimelineRepository.addTestEvent(testTimelineData = addTestTimeline)
        }
    }

//    val splitList = ENGLISH2012.split(" ")
//    val subject = splitList[0]
//    val year = splitList[1]

}

private fun Long.pad(): String {

    return this.toString().padStart(2, '0')
}

private fun Long.padEng(): String {

    return this.toString().padStart(2, '0')
}


private fun Long.padStudy(): String {

    return this.toString().padStart(2, '0')
}
