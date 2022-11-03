package com.pktech.data.repository

import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.local.entity.dao.SaveQuestionDataDAO
import com.pktech.domain.repository.SaveQuestionRepository
import kotlinx.coroutines.flow.Flow

class SaveQuestionRepositoryImpl(
    private val dao: SaveQuestionDataDAO
): SaveQuestionRepository {

    override fun getAllSaveQuestion(): Flow<List<SaveQuestionData>> {
        return dao.getAllSaveQuestion()
    }

    override suspend fun deleteSaveQuestion(deleteSaveQuestion: SaveQuestionData) {
        dao.deleteSaveQuestion(deleteSaveQuestion = deleteSaveQuestion)
    }

    override suspend fun addSaveQuestion(addSaveQuestion: SaveQuestionData) {
        dao.addSaveQuestion(addSaveQuestion = addSaveQuestion)
    }

}