package com.pktech.data.repository

import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.English
import com.pktech.data.local.entity.dao.EnglishDAO
import com.pktech.domain.repository.EnglishRepository

class EnglishRepositoryImpl(
    private val dao: EnglishDAO
): EnglishRepository {

    override suspend fun deleteAllEnglish() {
        dao.deleteAll()
    }

    override suspend fun addEnglish(addEnglish: List<English>) {
        dao.addEnglish(allEnglish = addEnglish)
    }

    override fun getAYear(year: String): LiveData<List<English>> {
        return  dao.getAYear(year = year)
    }


}