package com.pktech.presentation.screens.subjects.govt.year.govt2015


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Government2015VM @Inject constructor(
   private val governmentRepository: GovernmentRepository
):ViewModel() {

    var  getGovernment2015: LiveData<Government> = governmentRepository.getAYearGovernment(year = "2015")


}

