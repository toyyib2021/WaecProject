package com.pktech.presentation.screens.subjects.litineng.year.liteng2014


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Literature2014VM @Inject constructor(
   private val literatureRepository: LiteratureRepository
):ViewModel() {

    var  getLiterature2014: LiveData<Literature> = literatureRepository.getAYearLiterature(year = "2014")


}

