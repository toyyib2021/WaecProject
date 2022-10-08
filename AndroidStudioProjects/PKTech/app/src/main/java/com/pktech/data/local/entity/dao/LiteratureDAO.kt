package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface LiteratureDAO {

    @Query("DELETE FROM literature_questions_table")
    suspend fun deleteAllLiterature()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addLiterature(addLiterature: List<Literature>)

    @Query("SELECT *FROM literature_questions_table WHERE year =:year")
    fun getAYearLiterature(year: String): LiveData<Literature>

}
