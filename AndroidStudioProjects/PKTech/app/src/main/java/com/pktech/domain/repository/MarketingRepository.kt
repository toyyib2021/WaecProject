package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface MarketingRepository {

    suspend fun deleteAllMarketing()

    suspend fun addMarketing(addMarketing: List<Marketing>)

    fun getAYearMarketing(year: String): LiveData<Marketing>

}