package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface EnglishRepository {


    suspend fun deleteAllEnglish()


    suspend fun addEnglish(addEnglish: List<English>)


    fun getAYear(year: String): LiveData<English>

}