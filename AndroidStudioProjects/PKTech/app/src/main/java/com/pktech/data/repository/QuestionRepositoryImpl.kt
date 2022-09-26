package com.pktech.data.repository

import androidx.lifecycle.LiveData
import com.pktech.data.local.QuestionsDAO
import com.pktech.data.local.entity.Subjects
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.domain.repository.QuestionsRepository
import com.pktech.utill.RequestState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuestionRepositoryImpl(
    private val dao: QuestionsDAO
): QuestionsRepository {

    override  fun getAllSubjects(): LiveData<List<Subjects>> {
        return dao.getAllSubjects()
    }

    override suspend fun addAllSubjects(allSubject: List<Subjects>) {
        return dao.addAllSubjects(allSubject = allSubject)
    }



    override  fun getAllImage(): LiveData<List<ImageDB>> {
        return dao.getAllImage()
    }

    override suspend fun addAllImage(allImage: List<ImageDB>) {
        dao.addAllImage(allImage = allImage)
    }

    override fun getSingleImage(imageDB: Int): LiveData<ImageDB> {
        return dao.getSingleImage(imageDB = imageDB)
    }

    override suspend fun addEmptyOptions(emptyOptions: List<SelectedOptionDB>) {
        dao.addEmptyOptions(emptyOptions = emptyOptions)
    }

    override suspend fun addUpdateOptions(updateOptions: SelectedOptionDB) {
        dao.addUpdateOptions(updateOptions = updateOptions)
    }

    override suspend fun deleteOptions(deleteOptions: List<SelectedOptionDB>) {
        dao.deleteOptions(deleteOptions = deleteOptions)
    }

    override fun getSelectedOption(): LiveData<List<SelectedOptionDB>> {
        return dao.getSelectedOption()
    }

    override suspend fun deleteAll(){
        dao.deleteAll()
    }

    override suspend fun deleteAllSelectedOption() {
        dao.deleteAllSelectedOption()
    }

    override fun getSelectedOptionFLow(): Flow<List<SelectedOptionDB>> {
       return dao.getSelectedOptionFLow()
    }


}