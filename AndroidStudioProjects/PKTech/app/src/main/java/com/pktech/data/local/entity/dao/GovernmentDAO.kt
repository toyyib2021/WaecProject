package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface GovernmentDAO {

    @Query("DELETE FROM government_questions_table")
    suspend fun deleteAllGovernment()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addGovernment(addGovernment: List<Government>)

    @Query("SELECT *FROM government_questions_table WHERE year =:year")
    fun getAYearGovernment(year: String): LiveData<Government>

}
