package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface PhysicsDAO {

    @Query("DELETE FROM physics_questions_table")
    suspend fun deleteAllPhysics()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPhysics(addPhysics: List<Physics>)

    @Query("SELECT *FROM physics_questions_table WHERE year =:year")
    fun getAYearPhysics(year: String): LiveData<Physics>

}
