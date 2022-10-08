package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface EconomicsRepository {

    suspend fun deleteAllEconomics()

    suspend fun addEconomics(addEconomics: List<Economics>)

    fun getAYearEconomics(year: String): LiveData<Economics>

}