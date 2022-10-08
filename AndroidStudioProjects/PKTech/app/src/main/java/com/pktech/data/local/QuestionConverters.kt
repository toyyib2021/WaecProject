package com.pktech.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.pktech.data.local.utill.JsonParser
import com.pktech.domain.model.Questions


//@ProvidedTypeConverter
//class QuestionConverters(private val jsonParser: JsonParser) {
//
//    @TypeConverter
//    fun fromMeaningsJson(json: String): List<List<Questions>> {
//        return jsonParser.fromJson<ArrayList<List<Questions>>>(
//            json,
//            object : TypeToken<ArrayList<List<Questions>>>(){}.type
//        ) ?: emptyList()
//    }
//
//    @TypeConverter
//    fun toMeaningsJson(meanings: List<List<Questions>>): String {
//        return jsonParser.toJson(
//            meanings,
//            object : TypeToken<ArrayList<List<Questions>>>(){}.type
//        ) ?: "[]"
//    }
//}