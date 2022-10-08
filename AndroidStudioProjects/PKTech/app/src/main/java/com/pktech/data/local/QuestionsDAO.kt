package com.pktech.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.Subjects
import com.pktech.utill.RequestState
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestionsDAO {



    @Query("SELECT options FROM selected_option_table")
    fun getOptionsCol(): LiveData<List<String>>


    @Query("DELETE FROM selected_option_table")
    suspend fun deleteAllSelectedOption()


    @Query("SELECT *FROM questions_image_table ORDER BY id ASC")
    fun getAllImage(): LiveData<List<ImageDB>>

    @Query("DELETE FROM questions_image_table")
    suspend fun deleteAllImage()

    @Query("SELECT *FROM questions_image_table WHERE id =:imageDB")
    fun getSingleImage(imageDB: String): LiveData<ImageDB>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllImage(allImage: List<ImageDB>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEmptyOptions(emptyOptions: List<SelectedOptionDB>)

    @Update
    suspend fun addUpdateOptions(updateOptions: SelectedOptionDB)

    @Delete
    suspend fun deleteOptions(deleteOptions: List<SelectedOptionDB>)

    @Query("SELECT *FROM selected_option_table ORDER BY id ASC")
    fun getSelectedOption(): LiveData<List<SelectedOptionDB>>

    @Query("SELECT *FROM selected_option_table ORDER BY id ASC")
    fun getSelectedOptionFLow(): Flow<List<SelectedOptionDB>>




}