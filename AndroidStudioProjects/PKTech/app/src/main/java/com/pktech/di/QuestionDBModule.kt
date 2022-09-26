package com.pktech.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.pktech.utill.Constants.QUESTIONS_DATABASE
import com.pktech.data.local.QuestionConverters
import com.pktech.data.local.QuestionDB
import com.pktech.data.local.utill.GsonParser
import com.pktech.data.local.utill.ImageConverters
import com.pktech.data.repository.QuestionRepositoryImpl
import com.pktech.domain.repository.QuestionsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object QuestionDBModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): QuestionDB {
        return Room.databaseBuilder(
            context,
            QuestionDB::class.java,
            QUESTIONS_DATABASE
        ).addTypeConverter(QuestionConverters(GsonParser(Gson())))
            .addTypeConverter(ImageConverters())
            .build()
    }

    @Provides
    @Singleton
    fun provideQuestionRepository( dao: QuestionDB ): QuestionsRepository {
        return QuestionRepositoryImpl(dao = dao.questionsDao())
    }


}