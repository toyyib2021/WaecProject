package com.pktech.domain.repository

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.Subjects
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.domain.model.Questions
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

interface QuestionsRepository {

    fun getOptionsCol(): LiveData<List<String>>

     fun getAllImage(): LiveData<List<ImageDB>>

    suspend fun addAllImage(allImage: List<ImageDB>)

     fun getSingleImage(imageDB: String): LiveData<ImageDB>

    suspend fun deleteAllImage()

    suspend fun addEmptyOptions(emptyOptions: List<SelectedOptionDB>)


    suspend fun addUpdateOptions(updateOptions: SelectedOptionDB)


    suspend fun deleteOptions(deleteOptions: List<SelectedOptionDB>)


    fun getSelectedOption(): LiveData<List<SelectedOptionDB>>


    suspend fun deleteAllSelectedOption()

    fun getSelectedOptionFLow(): Flow<List<SelectedOptionDB>>


}