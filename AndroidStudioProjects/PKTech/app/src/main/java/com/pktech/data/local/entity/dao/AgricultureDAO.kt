package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface AgricultureDAO {

    @Query("DELETE FROM agric_science_questions_table")
    suspend fun deleteAllAgriculture()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAgriculture(addAgriculture: List<Agriculture>)

    @Query("SELECT *FROM agric_science_questions_table WHERE year =:year")
    fun getAYearAgriculture(year: String): LiveData<Agriculture>

}
