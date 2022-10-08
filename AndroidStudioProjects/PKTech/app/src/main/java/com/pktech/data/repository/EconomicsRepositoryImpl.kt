package com.pktech.data.repository

import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Economics
import com.pktech.data.local.entity.English
import com.pktech.data.local.entity.dao.EconomicsDAO
import com.pktech.data.local.entity.dao.EnglishDAO
import com.pktech.domain.repository.EconomicsRepository
import com.pktech.domain.repository.EnglishRepository

class EconomicsRepositoryImpl(
    private val dao: EconomicsDAO
): EconomicsRepository {
    override suspend fun deleteAllEconomics() {
       dao.deleteAllEconomics()
    }

    override suspend fun addEconomics(addEconomics: List<Economics>) {
        dao.addEconomics(addEconomics = addEconomics)
    }

    override fun getAYearEconomics(year: String): LiveData<Economics> {
        return dao.getAYearEconomics(year = year)
    }


}