package com.pktech.domain.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.SaveQuestionData
import kotlinx.coroutines.flow.Flow

interface SaveQuestionRepository {

    fun getAllSaveQuestion(): Flow<List<SaveQuestionData>>

    suspend fun deleteSaveQuestion(deleteSaveQuestion: SaveQuestionData)


    suspend fun addSaveQuestion(addSaveQuestion: SaveQuestionData)
}