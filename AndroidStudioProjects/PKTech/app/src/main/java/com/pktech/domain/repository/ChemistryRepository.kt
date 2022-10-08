package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface ChemistryRepository {

    suspend fun deleteAllChemistry()

    suspend fun addChemistry(addChemistry: List<Chemistry>)

    fun getAYearChemistry(year: String): LiveData<Chemistry>

}