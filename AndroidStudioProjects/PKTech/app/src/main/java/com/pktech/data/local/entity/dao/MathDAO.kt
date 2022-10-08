package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface MathDAO {

    @Query("DELETE FROM maths_questions_table")
    suspend fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMaths(addMath: List<Maths>)

    @Query("SELECT *FROM maths_questions_table WHERE year =:year")
    fun getAYear(year: String): LiveData<Maths>

}
