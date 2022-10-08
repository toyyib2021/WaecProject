package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Government
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.GovernmentDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.GovernmentRepository


class GovernmentRepositoryImpl(
    private val dao: GovernmentDAO
): GovernmentRepository {
    override suspend fun deleteAllGovernment() {
        dao.deleteAllGovernment()
    }

    override suspend fun addGovernment(addGovernment: List<Government>) {
        dao.addGovernment(addGovernment = addGovernment)
    }

    override fun getAYearGovernment(year: String): LiveData<Government> {
        return dao.getAYearGovernment(year = year)
    }


}