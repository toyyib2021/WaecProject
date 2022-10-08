package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface PhysicsRepository {

    suspend fun deleteAllPhysics()

    suspend fun addPhysics(addPhysics: List<Physics>)

    fun getAYearPhysics(year: String): LiveData<Physics>

}