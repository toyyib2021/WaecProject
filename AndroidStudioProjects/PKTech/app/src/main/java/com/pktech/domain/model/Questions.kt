package com.pktech.domain.model

import kotlinx.serialization.Serializable


@Serializable
data class Questions(
    val objective: Objective,
    val theory: Theory = Theory(
        "", "", "", "", "", "", )
)