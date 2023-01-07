package com.pktech.presentation.screens.subjects.physics.year.phy2015

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.*
import coil.ImageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.pktech.data.local.entity.*
import com.pktech.data.repository.AllImage
import com.pktech.data.repository.UiRepository
import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.pktech.domain.model.Questions
import com.pktech.domain.repository.MathRepository
import com.pktech.domain.repository.PhysicsRepository
import com.pktech.presentation.screens.list.ListUiState
import kotlinx.coroutines.flow.*
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.time.Duration
import kotlin.time.ExperimentalTime


@OptIn(ExperimentalTime::class)
@HiltViewModel
class Physics2015VM @Inject constructor(
   val physicsRepository: PhysicsRepository
):ViewModel() {

    var  getPhysics2015: LiveData<Physics> = physicsRepository.getAYearPhysics(year = "2015")


}

