package com.pktech.presentation.screens.subjects.civilEdu.year.civil2019


import androidx.lifecycle.*
import com.pktech.data.local.entity.CivicEdu
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.CivicEduRepository


@HiltViewModel
class CivicEdu2019VM @Inject constructor(
   private val civicEduRepository: CivicEduRepository
):ViewModel() {

    var  getCivicEdu2019: LiveData<CivicEdu> = civicEduRepository.getAYearCivicEdu(year = "2019")



}

