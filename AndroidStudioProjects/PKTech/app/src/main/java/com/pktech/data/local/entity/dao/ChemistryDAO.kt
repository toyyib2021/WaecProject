package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface ChemistryDAO {

    @Query("DELETE FROM chemistry_questions_table")
    suspend fun deleteAllChemistry()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addChemistry(addChemistry: List<Chemistry>)

    @Query("SELECT *FROM chemistry_questions_table WHERE year =:year")
    fun getAYearChemistry(year: String): LiveData<Chemistry>

}
