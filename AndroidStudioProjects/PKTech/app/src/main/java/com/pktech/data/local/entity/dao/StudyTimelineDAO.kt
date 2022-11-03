package com.pktech.data.local.entity.dao

import androidx.room.*
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.local.entity.StudyTimelineData
import kotlinx.coroutines.flow.Flow

@Dao
interface StudyTimelineDAO {

    @Query("SELECT *FROM study_timeline_table ORDER BY id DESC")
    fun getAllStudyEvent(): Flow<List<StudyTimelineData>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addStudyEvent(studyTimelineData: StudyTimelineData)

}
