package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Literature
import com.pktech.data.local.entity.dao.LiteratureDAO
import com.pktech.domain.repository.LiteratureRepository


class LiteratureRepositoryImpl(
    private val dao: LiteratureDAO
): LiteratureRepository {
    override suspend fun deleteAllLiterature() {
        dao.deleteAllLiterature()
    }

    override suspend fun addLiterature(addLiterature: List<Literature>) {
        dao.addLiterature(addLiterature = addLiterature)
    }

    override fun getAYearLiterature(year: String): LiveData<Literature> {
        return dao.getAYearLiterature(year = year)
    }


}