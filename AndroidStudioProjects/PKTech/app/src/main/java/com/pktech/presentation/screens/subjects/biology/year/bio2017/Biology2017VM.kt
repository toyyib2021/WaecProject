package com.pktech.presentation.screens.subjects.biology.year.bio2017


import androidx.lifecycle.*
import com.pktech.data.local.entity.Agriculture
import com.pktech.data.local.entity.Biology
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AgricultureRepository
import com.pktech.domain.repository.BiologyRepository


@HiltViewModel
class Biology2017VM @Inject constructor(
   private val biologyRepository: BiologyRepository,
):ViewModel() {

    var  getBiology2017: LiveData<Biology> = biologyRepository.getAYearBiology(year = "2017")



}

