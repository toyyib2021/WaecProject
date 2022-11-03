package com.pktech.presentation.screens.subjects.eng.year.eng2014


import androidx.lifecycle.*
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.English
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.EnglishRepository


@HiltViewModel
class English2014VM @Inject constructor(
   private val englishRepository: EnglishRepository,
):ViewModel() {

    var  getEnglish2014: LiveData<English> = englishRepository.getAYear(year = "2014")


}

