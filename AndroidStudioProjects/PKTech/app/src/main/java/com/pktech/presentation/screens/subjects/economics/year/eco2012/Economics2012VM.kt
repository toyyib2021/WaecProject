package com.pktech.presentation.screens.subjects.economics.year.eco2012


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Economics2012VM @Inject constructor(
   private val economicsRepository: EconomicsRepository
):ViewModel() {

    var  getEconomics2012: LiveData<Economics> = economicsRepository.getAYearEconomics(year = "2012")


}

