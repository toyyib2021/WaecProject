package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface MarketingDAO {

    @Query("DELETE FROM marketing_questions_table")
    suspend fun deleteAllMarketing()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMarketing(addMarketing: List<Marketing>)

    @Query("SELECT *FROM marketing_questions_table WHERE year =:year")
    fun getAYearMarketing(year: String): LiveData<Marketing>

}
