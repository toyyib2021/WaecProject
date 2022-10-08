package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface CommerceRepository {

    suspend fun deleteAllCommerce()

    suspend fun addCommerce(addCommerce: List<Commerce>)

    fun getAYearCommerce(year: String): LiveData<Commerce>

}