package com.pktech.data.local.entity.dao

import androidx.room.*
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.local.entity.StudyTimelineData
import com.pktech.data.local.entity.TestTimelineData
import kotlinx.coroutines.flow.Flow

@Dao
interface TestTimelineDAO {

    @Query("SELECT *FROM test_timeline_table ORDER BY id DESC")
    fun getAllTestEvent(): Flow<List<TestTimelineData>>

    @Query("SELECT *FROM test_timeline_table WHERE subject = :subject")
    fun getAllTestSubjectEvent(subject: String): Flow<List<TestTimelineData>>


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addStudyEvent(testTimelineData: TestTimelineData)

}
