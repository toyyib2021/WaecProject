package com.pktech.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Theory(
    val id: String,
    val instructions: String = "",
    val image: String = "",
    val essay: String ="",
    val question: String,
    val answer: String,
)
