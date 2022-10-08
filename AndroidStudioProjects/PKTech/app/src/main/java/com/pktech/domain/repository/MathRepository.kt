package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.Subjects
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.Maths
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface MathRepository {


    suspend fun deleteAll()


    suspend fun addMaths(addMaths: List<Maths>)


    fun getAYear(year: String): LiveData<Maths>

}