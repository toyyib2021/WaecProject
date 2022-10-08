package com.pktech.data.remote

import com.pktech.data.local.entity.Subjects
import retrofit2.http.GET

interface QuestionsAPI {

    @GET("/all-questions")
    suspend fun getAllQuestion(): List<Subjects>

    companion object {
        const val BASE_URL = "https://weftw.herokuapp.com/"
    }
}