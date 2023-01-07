package com.pktech.presentation.screens.subjects.agriculture.year.agric2014


import androidx.lifecycle.*
import com.pktech.data.local.entity.Agriculture
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AgricultureRepository


@HiltViewModel
class Agric2014VM @Inject constructor(
   private val agricultureRepository: AgricultureRepository,
):ViewModel() {

    var  getAgric2014: LiveData<Agriculture> = agricultureRepository.getAYearAgriculture(year = "2014")



}

