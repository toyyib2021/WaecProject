package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface BiologyRepository {

    suspend fun deleteAllBiology()

    suspend fun addBiology(addBiology: List<Biology>)

    fun getAYearBiology(year: String): LiveData<Biology>

}