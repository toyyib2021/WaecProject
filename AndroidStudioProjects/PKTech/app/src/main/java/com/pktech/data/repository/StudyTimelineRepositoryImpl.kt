package com.pktech.data.repository

import com.pktech.data.local.entity.StudyTimelineData
import com.pktech.data.local.entity.dao.StudyTimelineDAO
import com.pktech.domain.repository.StudyTimelineRepository
import kotlinx.coroutines.flow.Flow

class StudyTimelineRepositoryImpl(
    private val dao: StudyTimelineDAO
): StudyTimelineRepository {
    override fun getAllStudyEvent(): Flow<List<StudyTimelineData>> {
        return dao.getAllStudyEvent()
    }

    override suspend fun addStudyEvent(studyTimelineData: StudyTimelineData) {
        dao.addStudyEvent(studyTimelineData = studyTimelineData)
    }


}