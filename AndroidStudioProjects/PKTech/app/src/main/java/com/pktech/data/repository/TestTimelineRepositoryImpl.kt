package com.pktech.data.repository

import com.pktech.data.local.entity.TestTimelineData
import com.pktech.data.local.entity.dao.TestTimelineDAO
import com.pktech.domain.repository.TestTimelineRepository
import kotlinx.coroutines.flow.Flow


class TestTimelineRepositoryImpl
    ( private val dao: TestTimelineDAO
): TestTimelineRepository {

    override fun getAllTestEvent(): Flow<List<TestTimelineData>> {
        return dao.getAllTestEvent()
    }

    override fun getAllTestSubjectEvent(subject: String): Flow<List<TestTimelineData>>{
        return dao.getAllTestSubjectEvent(subject = subject)
    }

    override suspend fun addTestEvent(testTimelineData: TestTimelineData) {
        dao.addStudyEvent(testTimelineData = testTimelineData)
    }

}