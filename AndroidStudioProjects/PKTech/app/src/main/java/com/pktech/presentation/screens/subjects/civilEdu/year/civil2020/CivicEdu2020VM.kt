package com.pktech.presentation.screens.subjects.civilEdu.year.civil2020


import androidx.lifecycle.*
import com.pktech.data.local.entity.CivicEdu
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.CivicEduRepository


@HiltViewModel
class CivicEdu2020VM @Inject constructor(
   private val civicEduRepository: CivicEduRepository
):ViewModel() {

    var  getCivicEdu2020: LiveData<CivicEdu> = civicEduRepository.getAYearCivicEdu(year = "2020")



}

