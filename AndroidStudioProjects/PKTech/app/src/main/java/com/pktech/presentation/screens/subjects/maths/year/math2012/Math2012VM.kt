package com.pktech.presentation.screens.subjects.maths.year.math2012

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
class Math2012VM @Inject constructor(
    val repository: QuestionsRepository,
   val mathrepository: MathRepository
):ViewModel() {

    var  getMaths2012: LiveData<Maths> = mathrepository.getAYear(year = "2012")





    var getImage1: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion1")
    var getImage2: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion2")
    var getImage3: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion3")
    var getImage4: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion4")
    var getImage5: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion5")
    var getImage6: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion6")
    var getImage7: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion7")
    var getImage8: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion8")
    var getImage9: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion9")
    var getImage10: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion10")
    var getImage11: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion11")
    var getImage12: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion12")
    var getImage13: LiveData<ImageDB> = repository.getSingleImage("mathObjQuestion13")



}

