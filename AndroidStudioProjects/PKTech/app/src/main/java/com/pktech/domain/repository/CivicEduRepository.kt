package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface CivicEduRepository {

    suspend fun deleteAllCivicEdu()

    suspend fun addCivicEdu(addCivicEdu: List<CivicEdu>)

    fun getAYearCivicEdu(year: String): LiveData<CivicEdu>

}