package com.pktech.presentation.screens.splashScreen

import androidx.lifecycle.ViewModel

import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class SplashViewModel  @Inject constructor(
    val repository: QuestionsRepository
):ViewModel() {



}