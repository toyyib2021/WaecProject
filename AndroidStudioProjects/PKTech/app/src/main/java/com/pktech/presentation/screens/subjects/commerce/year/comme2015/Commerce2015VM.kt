package com.pktech.presentation.screens.subjects.commerce.year.comme2015


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Commerce2015VM @Inject constructor(
   private val commerceRepository: CommerceRepository
):ViewModel() {

    var  getCommerce2015: LiveData<Commerce> = commerceRepository.getAYearCommerce(year = "2015")



}

