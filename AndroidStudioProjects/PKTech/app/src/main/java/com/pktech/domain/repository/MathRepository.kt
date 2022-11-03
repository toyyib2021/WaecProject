package com.pktech.domain.repository

import androidx.lifecycle.LiveData

import com.pktech.data.local.entity.Maths


interface MathRepository {


    suspend fun deleteAll()


    suspend fun addMaths(addMaths: List<Maths>)


    fun getAYear(year: String): LiveData<Maths>

}