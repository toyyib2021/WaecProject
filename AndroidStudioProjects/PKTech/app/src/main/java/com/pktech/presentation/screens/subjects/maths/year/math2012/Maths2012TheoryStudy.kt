package com.pktech.presentation.screens.subjects.maths.year.math2012

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.flowWithLifecycle
import com.pktech.data.local.entity.Maths
import com.pktech.domain.model.Questions
import com.pktech.presentation.screens.subjects.SubjectTestVM
import com.pktech.presentation.screens.subjects.SubjectVM


@Composable
fun Math2012Theory(){

    val subjectTestVM: SubjectTestVM = hiltViewModel()

    val getMAth2012R = subjectTestVM.getMaths2012.value

    val getMath2012 by subjectTestVM.getMaths2012.observeAsState(listOf<Maths>())

    Log.i(TAG, "Math2012TheoryStudy: getMAth2012R $getMAth2012R")

    val questions = getMAth2012R?.maths?.get(0)?.theory?.question

    getMath2012::class.java

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (questions != null) {
            Text(
                text = questions,
                style = MaterialTheme.typography.h2,
            )
        }


    }

}