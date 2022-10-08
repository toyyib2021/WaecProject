package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Agriculture
import com.pktech.data.local.entity.dao.AgricultureDAO
import com.pktech.domain.repository.AgricultureRepository


class AgricultureRepositoryImpl(
    private val dao: AgricultureDAO
): AgricultureRepository {
    override suspend fun deleteAllAgriculture() {
        dao.deleteAllAgriculture()
    }

    override suspend fun addAgriculture(addAgriculture: List<Agriculture>) {
        dao.addAgriculture(addAgriculture = addAgriculture)
    }

    override fun getAYearAgriculture(year: String): LiveData<Agriculture> {
        return dao.getAYearAgriculture(year = year)
    }


}