package com.pktech.presentation.screens.subjects.litineng.year.liteng2017


import androidx.lifecycle.*
import com.pktech.data.local.entity.*
import com.pktech.domain.repository.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class Literature2017VM @Inject constructor(
   private val literatureRepository: LiteratureRepository
):ViewModel() {

    var  getLiterature2017: LiveData<Literature> = literatureRepository.getAYearLiterature(year = "2017")


}

