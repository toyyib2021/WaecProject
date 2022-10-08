package com.pktech.data.local.utill

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.pktech.data.local.utill.JsonParser
import com.pktech.domain.model.Questions
import java.io.ByteArrayOutputStream


//@ProvidedTypeConverter
//class ImageConverters() {
//
//    @TypeConverter
//    fun fromBitmap(bitmap: Bitmap): ByteArray {
//        val outputStream = ByteArrayOutputStream()
//        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
//        return outputStream.toByteArray()
//    }
//
//    @TypeConverter
//    fun toBitmap(byteArray: ByteArray): Bitmap{
//        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
//
//    }
//}