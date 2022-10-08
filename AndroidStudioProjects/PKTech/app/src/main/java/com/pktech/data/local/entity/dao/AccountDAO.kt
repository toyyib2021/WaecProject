package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface AccountDAO {

    @Query("DELETE FROM account_questions_table")
    suspend fun deleteAllAccount()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAccount(addAccount: List<Account>)

    @Query("SELECT *FROM account_questions_table WHERE year =:year")
    fun getAYearAccount(year: String): LiveData<Account>

}
