package com.pktech.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.utill.Constants
import com.pktech.utill.Constants.STUDY_TIMELINE_TABLE


@Entity(tableName = STUDY_TIMELINE_TABLE)
data class StudyTimelineData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var year: String,
    var subject: String,
    var date: String,
    var time: String,
    var studyHours: String,
    var studyMinis: String,
    )


