package com.pktech.data.local.entity

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pktech.utill.Constants.QUESTIONS_IMAGE_DATABASE_TABLE

@Entity(tableName = QUESTIONS_IMAGE_DATABASE_TABLE)
data class ImageDB(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val bitmap: Bitmap)
