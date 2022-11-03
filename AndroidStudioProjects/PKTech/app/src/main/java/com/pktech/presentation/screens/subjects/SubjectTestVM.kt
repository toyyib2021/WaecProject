package com.pktech.presentation.screens.subjects
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.pktech.data.local.entity.Maths
import com.pktech.domain.repository.MathRepository
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class SubjectTestVM @Inject constructor(
   val repository: MathRepository
):ViewModel() {

   var getMaths2012: LiveData<Maths> = repository.getAYear(year = "2012")



}






