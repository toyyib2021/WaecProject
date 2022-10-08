package com.pktech.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.pktech.data.local.entity.*
import com.pktech.data.local.entity.dao.*
import com.pktech.data.local.utill.NewQuestionConverters
import com.pktech.data.local.utill.QuestionImageConverters


@Database(
    entities =
    [ ImageDB::class,
        SelectedOptionDB::class,
        English::class,
        Maths::class,
        Account::class,
    Economics::class,
    CivicEdu::class,
    Biology::class,
    Commerce::class,
    Physics::class,
    Agriculture::class,
    Literature::class,
    Chemistry::class,
    Government::class,
    Marketing::class
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters( QuestionImageConverters::class, NewQuestionConverters::class)
abstract class QuestionDB: RoomDatabase() {

    abstract fun questionsDao(): QuestionsDAO
    abstract fun englishDAO(): EnglishDAO
    abstract fun mathDAO(): MathDAO
    abstract fun accountDAO(): AccountDAO
   abstract fun economicsDAO(): EconomicsDAO
   abstract fun civicEduDAO(): CivicEducationDAO
   abstract fun biologyDAO(): BiologyDAO
   abstract fun commerceDAO(): CommerceDAO
   abstract fun physicsDAO(): PhysicsDAO
   abstract fun agricultureDAO(): AgricultureDAO
   abstract fun literatureDAO(): LiteratureDAO
   abstract fun chemistryDAO(): ChemistryDAO
   abstract fun governmentDAO(): GovernmentDAO
   abstract fun marketingDAO(): MarketingDAO

}