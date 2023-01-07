package com.pktech.presentation.screens.subjects.biology.year.bio2020


import androidx.lifecycle.*
import com.pktech.data.local.entity.Agriculture
import com.pktech.data.local.entity.Biology
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AgricultureRepository
import com.pktech.domain.repository.BiologyRepository


@HiltViewModel
class Biology2020VM @Inject constructor(
   private val biologyRepository: BiologyRepository,
):ViewModel() {

    var  getBiology2020: LiveData<Biology> = biologyRepository.getAYearBiology(year = "2020")



}

