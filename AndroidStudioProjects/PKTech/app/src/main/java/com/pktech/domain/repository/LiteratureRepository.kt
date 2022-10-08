package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface LiteratureRepository {

    suspend fun deleteAllLiterature()

    suspend fun addLiterature(addLiterature: List<Literature>)

    fun getAYearLiterature(year: String): LiveData<Literature>

}