package com.pktech.presentation.screens.subjects.eng.year.eng2012


import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.*
import com.pktech.data.local.entity.English
import com.pktech.data.local.entity.SelectedOptionDB
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.EnglishRepository
import com.pktech.domain.repository.QuestionsRepository
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@HiltViewModel
class English2012VM @Inject constructor(
    private val englishRepository: EnglishRepository,
):ViewModel() {

    var  getEnglish2012: LiveData<English> = englishRepository.getAYear(year = "2012")






}



