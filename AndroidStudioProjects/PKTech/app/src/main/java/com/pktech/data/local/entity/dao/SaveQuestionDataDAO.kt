package com.pktech.data.local.entity.dao

import androidx.room.*
import com.pktech.data.local.entity.SaveQuestionData
import kotlinx.coroutines.flow.Flow

@Dao
interface SaveQuestionDataDAO {

    @Query("SELECT *FROM save_question_table ORDER BY id DESC")
    fun getAllSaveQuestion(): Flow<List<SaveQuestionData>>

    @Delete
    suspend fun deleteSaveQuestion(deleteSaveQuestion: SaveQuestionData)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addSaveQuestion(addSaveQuestion: SaveQuestionData)

}
