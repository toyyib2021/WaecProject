package com.pktech.presentation.screens.subjects.agriculture.year.agric2017


import androidx.lifecycle.*
import com.pktech.data.local.entity.Agriculture
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AgricultureRepository


@HiltViewModel
class Agric2017VM @Inject constructor(
   private val agricultureRepository: AgricultureRepository,
):ViewModel() {

    var  getAgric2017: LiveData<Agriculture> = agricultureRepository.getAYearAgriculture(year = "2017")



}

