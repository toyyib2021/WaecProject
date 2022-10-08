package com.pktech.domain.model

import kotlinx.serialization.Serializable





@Serializable
data class Objective(
    val id: String,
    val instructions: String = "",
    val image: String = "",
    val essay: String ="",
    val question: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val explanation: String,
    val correctOption: String,
    val questionUnderline: String = "",
    val questionEnd: String = "",
)

