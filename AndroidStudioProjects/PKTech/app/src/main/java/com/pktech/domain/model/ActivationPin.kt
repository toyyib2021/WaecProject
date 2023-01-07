package com.pktech.domain.model



//@Entity(tableName = Contant.DATABASE_ACTIVATION_TABLE)
data class ActivationPin(
//    @PrimaryKey(autoGenerate = false)
    val userEmail: String,
    val activationPin: String,
    val phoneNumber: String = ""
)
