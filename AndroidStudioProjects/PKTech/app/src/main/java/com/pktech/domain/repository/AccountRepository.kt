package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface AccountRepository {

    suspend fun deleteAllAccount()

    suspend fun addAccount(addMath: List<Account>)

    fun getAYearAccount(year: String): LiveData<Account>

}