package com.pktech.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.pktech.utill.Constants.QUESTIONS_DATABASE
import com.pktech.data.local.QuestionDB
import com.pktech.data.local.utill.GsonParser
import com.pktech.data.local.utill.NewQuestionConverters
import com.pktech.data.local.utill.QuestionImageConverters
import com.pktech.data.remote.QuestionsAPI
import com.pktech.data.repository.*
import com.pktech.domain.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
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
        )
//            .addTypeConverter(QuestionConverters(GsonParser(Gson())))
        .addTypeConverter(QuestionImageConverters())
        .addTypeConverter(NewQuestionConverters(GsonParser(Gson())))
            .build()
    }

    @Provides
    @Singleton
    fun provideQuestionRepository( dao: QuestionDB ): QuestionsRepository {
        return QuestionRepositoryImpl(dao = dao.questionsDao())
    }

    @Provides
    @Singleton
    fun provideMathsRepository( dao: QuestionDB ): MathRepository {
        return MathRepositoryImpl(dao = dao.mathDAO())
    }

    @Provides
    @Singleton
    fun provideEnglishRepository( dao: QuestionDB ): EnglishRepository {
        return EnglishRepositoryImpl(dao = dao.englishDAO())
    }

    @Provides
    @Singleton
    fun provideAccountRepository( dao: QuestionDB ): AccountRepository {
        return AccountRepositoryImpl(dao = dao.accountDAO())
    }

    @Provides
    @Singleton
    fun provideEconomicsRepository( dao: QuestionDB ): EconomicsRepository {
        return EconomicsRepositoryImpl(dao = dao.economicsDAO())
    }

    @Provides
    @Singleton
    fun provideCivicEduRepository( dao: QuestionDB ): CivicEduRepository {
        return CivicEduRepositoryImpl(dao = dao.civicEduDAO())
    }

    @Provides
    @Singleton
    fun provideBiologyRepository( dao: QuestionDB ): BiologyRepository {
        return BiologyRepositoryImpl(dao = dao.biologyDAO())
    }

    @Provides
    @Singleton
    fun provideCommerceRepository( dao: QuestionDB ): CommerceRepository {
        return CommerceRepositoryImpl(dao = dao.commerceDAO())
    }

    @Provides
    @Singleton
    fun providePhysicsRepository( dao: QuestionDB ): PhysicsRepository {
        return PhysicsRepositoryImpl(dao = dao.physicsDAO())
    }


    @Provides
    @Singleton
    fun provideAgricultureRepository( dao: QuestionDB ): AgricultureRepository {
        return AgricultureRepositoryImpl(dao = dao.agricultureDAO())
    }

    @Provides
    @Singleton
    fun provideLiteratureRepository( dao: QuestionDB ): LiteratureRepository {
        return LiteratureRepositoryImpl(dao = dao.literatureDAO())
    }

    @Provides
    @Singleton
    fun provideChemistryRepository( dao: QuestionDB ): ChemistryRepository {
        return ChemistryRepositoryImpl(dao =  dao.chemistryDAO())
    }

    @Provides
    @Singleton
    fun provideGovernmentRepository( dao: QuestionDB ): GovernmentRepository {
        return GovernmentRepositoryImpl(dao = dao.governmentDAO())
    }

    @Provides
    @Singleton
    fun provideMarketingRepository( dao: QuestionDB ): MarketingRepository {
        return MarketingRepositoryImpl(dao = dao.marketingDAO())
    }

    @Provides
    @Singleton
    fun provideSaveQuestionRepository( dao: QuestionDB ): SaveQuestionRepository {
        return SaveQuestionRepositoryImpl(dao = dao.saveQuestionDataDAO())
    }

    @Provides
    @Singleton
    fun provideStudyTimelineRepository( dao: QuestionDB ): StudyTimelineRepository {
        return StudyTimelineRepositoryImpl(dao = dao.studyTimelineDAO())
    }

    @Provides
    @Singleton
    fun provideTestTimelineRepository( dao: QuestionDB ): TestTimelineRepository {
        return TestTimelineRepositoryImpl(dao = dao.testTimelineDAO())
    }
    @Provides
    @Singleton
    fun provideQuestionsAPI(): QuestionsAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(QuestionsAPI.BASE_URL)
            .build()
            .create(QuestionsAPI::class.java)
    }


}