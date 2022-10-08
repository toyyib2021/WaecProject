package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface BiologyDAO {

    @Query("DELETE FROM biology_questions_table")
    suspend fun deleteAllBiology()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addBiology(addBiology: List<Biology>)

    @Query("SELECT *FROM biology_questions_table WHERE year =:year")
    fun getAYearBiology(year: String): LiveData<Biology>

}
