package com.pktech.data.remote

import com.pktech.data.local.entity.*
import retrofit2.http.GET

interface QuestionsAPI {

    @GET("/all-english")
    suspend fun getAllEnglish(): List<English>

    @GET("/all-mathematics")
    suspend fun getAllMathematics(): List<Maths>

    @GET("/all-economics")
    suspend fun getAllEconomic(): List<Economics>

    @GET("/all-civic-education")
    suspend fun getAllCivicEducation(): List<CivicEdu>

    @GET("/all-biology")
    suspend fun getAllBiology(): List<Biology>

    @GET("/all-commerce")
    suspend fun getAllCommerce(): List<Commerce>

    @GET("/all-account")
    suspend fun getAllAccount(): List<Account>

    @GET("/all-physics")
    suspend fun getAllPhysics(): List<Physics>

    @GET("/all-agriculture")
    suspend fun getAllAgriculture(): List<Agriculture>

    @GET("/all-literature")
    suspend fun getAllLiterature(): List<Literature>

    @GET("/all-chymistry")
    suspend fun getAllChemistry(): List<Chemistry>

    @GET("/all-government")
    suspend fun getAllGovernment(): List<Government>




    companion object {
        const val BASE_URL = "https://weftw.herokuapp.com/"
    }
}