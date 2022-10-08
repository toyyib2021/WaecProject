package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface CivicEducationDAO {

    @Query("DELETE FROM civic_education_questions_table")
    suspend fun deleteAllCivicEdu()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCivicEdu(addCivicEdu: List<CivicEdu>)

    @Query("SELECT *FROM civic_education_questions_table WHERE year =:year")
    fun getAYearCivicEdu(year: String): LiveData<CivicEdu>

}
