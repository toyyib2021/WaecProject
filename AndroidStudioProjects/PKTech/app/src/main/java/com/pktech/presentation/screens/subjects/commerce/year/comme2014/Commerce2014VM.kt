package com.pktech.presentation.screens.subjects.commerce.year.comme2014


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Commerce2014VM @Inject constructor(
   private val commerceRepository: CommerceRepository
):ViewModel() {

    var  getCommerce2014: LiveData<Commerce> = commerceRepository.getAYearCommerce(year = "2014")



}

