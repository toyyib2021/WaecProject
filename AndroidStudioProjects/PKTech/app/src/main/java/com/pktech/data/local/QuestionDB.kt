package com.pktech.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.data.local.utill.ImageConverters
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.local.entity.Subjects


@Database(
    entities = [Subjects::class, ImageDB::class, SelectedOptionDB::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(QuestionConverters::class, ImageConverters::class)
abstract class QuestionDB: RoomDatabase() {

    abstract fun questionsDao(): QuestionsDAO

}