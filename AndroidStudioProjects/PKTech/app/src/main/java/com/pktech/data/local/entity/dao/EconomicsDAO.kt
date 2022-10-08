package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface EconomicsDAO {

    @Query("DELETE FROM economics_questions_table")
    suspend fun deleteAllEconomics()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEconomics(addEconomics: List<Economics>)

    @Query("SELECT *FROM economics_questions_table WHERE year =:year")
    fun getAYearEconomics(year: String): LiveData<Economics>

}
