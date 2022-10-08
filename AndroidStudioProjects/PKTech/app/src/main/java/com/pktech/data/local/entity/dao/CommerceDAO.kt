package com.pktech.data.local.entity.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.*
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface CommerceDAO {

    @Query("DELETE FROM commerce_questions_table")
    suspend fun deleteAllCommerce()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCommerce(addCommerce: List<Commerce>)

    @Query("SELECT *FROM commerce_questions_table WHERE year =:year")
    fun getAYearCommerce(year: String): LiveData<Commerce>

}
