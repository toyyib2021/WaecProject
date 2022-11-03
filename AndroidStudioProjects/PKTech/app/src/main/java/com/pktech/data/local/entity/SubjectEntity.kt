package com.pktech.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.domain.model.Questions
import com.pktech.utill.Constants.ACCOUNT_QUESTIONS_TABLE
import com.pktech.utill.Constants.AGRIC_SCIENCE_QUESTIONS_TABLE
import com.pktech.utill.Constants.BIOLOGY_QUESTIONS_TABLE
import com.pktech.utill.Constants.CHEMISTRY_QUESTIONS_TABLE
import com.pktech.utill.Constants.CIVIC_EDUCATION_QUESTIONS_TABLE
import com.pktech.utill.Constants.COMMERCE_QUESTIONS_TABLE
import com.pktech.utill.Constants.ECONOMICS_QUESTIONS_TABLE
import com.pktech.utill.Constants.ENGLISH_QUESTION_TABLE
import com.pktech.utill.Constants.GOVERNMENT_QUESTIONS_TABLE
import com.pktech.utill.Constants.LITERATURE_QUESTIONS_TABLE
import com.pktech.utill.Constants.MARKETING_QUESTIONS_TABLE
import com.pktech.utill.Constants.MATHS_QUESTIONS_TABLE
import com.pktech.utill.Constants.PHYSICS_QUESTIONS_TABLE
import kotlinx.serialization.Serializable





@Entity(tableName = ENGLISH_QUESTION_TABLE)
@Serializable
data class English(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val english: List<Questions>
)

@Entity(tableName = MATHS_QUESTIONS_TABLE)
@Serializable
data class Maths(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val maths: List<Questions>
)

@Entity(tableName = ECONOMICS_QUESTIONS_TABLE)
@Serializable
data class Economics(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val economics: List<Questions>
)


@Entity(tableName = CIVIC_EDUCATION_QUESTIONS_TABLE)
@Serializable
data class CivicEdu(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val civic: List<Questions>
)


@Entity(tableName = BIOLOGY_QUESTIONS_TABLE)
@Serializable
data class Biology(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val biology: List<Questions>
)


@Entity(tableName = COMMERCE_QUESTIONS_TABLE)
@Serializable
data class Commerce(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val commerce: List<Questions>
)

@Entity(tableName = ACCOUNT_QUESTIONS_TABLE)
@Serializable
data class Account(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val account: List<Questions>
)


@Entity(tableName = PHYSICS_QUESTIONS_TABLE)
@Serializable
data class Physics(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val physics: List<Questions>
)

@Entity(tableName = AGRIC_SCIENCE_QUESTIONS_TABLE)
@Serializable
data class Agriculture(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val agriculture: List<Questions>
)

@Entity(tableName = LITERATURE_QUESTIONS_TABLE)
@Serializable
data class Literature(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val literature: List<Questions>
)

@Entity(tableName = CHEMISTRY_QUESTIONS_TABLE)
@Serializable
data class Chemistry(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val chemistry: List<Questions>
)

@Entity(tableName = GOVERNMENT_QUESTIONS_TABLE)
@Serializable
data class Government(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val government: List<Questions>
)

@Entity(tableName = MARKETING_QUESTIONS_TABLE)
@Serializable
data class Marketing(
    @PrimaryKey(autoGenerate = false)
    val year: String,
    val marketing: List<Questions>
)

























