package com.pktech.data.local.utill

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.pktech.data.local.utill.JsonParser
import com.pktech.domain.model.Questions


@ProvidedTypeConverter
class NewQuestionConverters(private val jsonParser: JsonParser) {

    @TypeConverter
    fun fromMeaningsJson(json: String): List<Questions> {
        return jsonParser.fromJson<ArrayList<Questions>>(
            json,
            object : TypeToken<ArrayList<Questions>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings: List<Questions>): String {
        return jsonParser.toJson(
            meanings,
            object : TypeToken<ArrayList<Questions>>(){}.type
        ) ?: "[]"
    }
}