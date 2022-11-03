package com.pktech.domain.repository



import com.pktech.data.local.entity.TestTimelineData
import kotlinx.coroutines.flow.Flow

interface TestTimelineRepository {

    fun getAllTestEvent(): Flow<List<TestTimelineData>>

    fun getAllTestSubjectEvent(subject: String): Flow<List<TestTimelineData>>

    suspend fun addTestEvent(testTimelineData: TestTimelineData)
}