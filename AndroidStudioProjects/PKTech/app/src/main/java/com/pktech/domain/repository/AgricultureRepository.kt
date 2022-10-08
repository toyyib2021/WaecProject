package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface AgricultureRepository {

    suspend fun deleteAllAgriculture()

    suspend fun addAgriculture(addAgriculture: List<Agriculture>)

    fun getAYearAgriculture(year: String): LiveData<Agriculture>

}