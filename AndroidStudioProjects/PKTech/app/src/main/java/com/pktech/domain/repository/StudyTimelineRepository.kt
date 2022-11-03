package com.pktech.domain.repository


import com.pktech.data.local.entity.StudyTimelineData
import kotlinx.coroutines.flow.Flow

interface StudyTimelineRepository {

    fun getAllStudyEvent(): Flow<List<StudyTimelineData>>

    suspend fun addStudyEvent(studyTimelineData: StudyTimelineData)
}