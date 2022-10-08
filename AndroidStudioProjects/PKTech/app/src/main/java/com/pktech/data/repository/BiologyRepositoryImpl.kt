package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Biology
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.BiologyDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.BiologyRepository


class BiologyRepositoryImpl(
    private val dao: BiologyDAO
): BiologyRepository {
    override suspend fun deleteAllBiology() {
        dao.deleteAllBiology()
    }

    override suspend fun addBiology(addBiology: List<Biology>) {
        dao.addBiology(addBiology = addBiology)
    }

    override fun getAYearBiology(year: String): LiveData<Biology> {
       return dao.getAYearBiology(year = year)
    }


}