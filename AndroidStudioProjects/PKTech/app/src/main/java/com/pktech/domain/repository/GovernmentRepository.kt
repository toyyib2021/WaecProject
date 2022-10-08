package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface GovernmentRepository {

    suspend fun deleteAllGovernment()

    suspend fun addGovernment(addGovernment: List<Government>)

    fun getAYearGovernment(year: String): LiveData<Government>

}