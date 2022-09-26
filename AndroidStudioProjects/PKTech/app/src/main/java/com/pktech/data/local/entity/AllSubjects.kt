package com.pktech.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.utill.Constants.QUESTIONS_DATABASE_TABLE
import com.pktech.domain.model.Questions
import kotlinx.serialization.Serializable





@Entity(tableName = QUESTIONS_DATABASE_TABLE)
@Serializable
data class Subjects(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val subject: List<List<Questions>>
)









