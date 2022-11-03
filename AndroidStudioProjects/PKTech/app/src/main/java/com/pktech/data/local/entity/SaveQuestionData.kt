package com.pktech.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.utill.Constants


@Entity(tableName = Constants.SAVE_QUESTION_DATABASE_TABLE)
data class SaveQuestionData(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var questionIndex: String,
    var instructions: String,
    var question: String,
    var questionTitle: String,
    var optionA: String? = null,
    var optionB: String? = null,
    var optionC: String? = null,
    var optionD: String? = null,
    var answer: String ,
    var questionUnderline: String = "",
    var questionEnd: String = "",
)
