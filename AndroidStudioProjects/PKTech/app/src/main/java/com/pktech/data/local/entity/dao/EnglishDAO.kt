package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.English

@Dao
interface EnglishDAO {

    @Query("DELETE FROM english_questions_table")
    suspend fun deleteAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEnglish(allEnglish: List<English>)

    @Query("SELECT *FROM english_questions_table WHERE year =:year")
    fun getAYear(year: String): LiveData<English>

}
