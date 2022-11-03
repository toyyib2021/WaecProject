package com.pktech.presentation.screens.subjects.chemistry.year.chy2012


import androidx.lifecycle.*
import com.pktech.data.local.entity.Agriculture
import com.pktech.data.local.entity.Biology
import com.pktech.data.local.entity.Chemistry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AgricultureRepository
import com.pktech.domain.repository.BiologyRepository
import com.pktech.domain.repository.ChemistryRepository


@HiltViewModel
class Chemistry2012VM @Inject constructor(
   private val chemistryRepository: ChemistryRepository,
):ViewModel() {

    var  getChemistry2012: LiveData<Chemistry> = chemistryRepository.getAYearChemistry(year = "2012")



}

