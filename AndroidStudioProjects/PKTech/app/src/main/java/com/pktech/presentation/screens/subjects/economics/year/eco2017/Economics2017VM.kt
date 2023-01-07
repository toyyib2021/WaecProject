package com.pktech.presentation.screens.subjects.economics.year.eco2017


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Economics2017VM @Inject constructor(
   private val economicsRepository: EconomicsRepository
):ViewModel() {

    var  getEconomics2017: LiveData<Economics> = economicsRepository.getAYearEconomics(year = "2017")


}

