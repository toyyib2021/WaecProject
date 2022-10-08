package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.CivicEdu
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.CivicEducationDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.CivicEduRepository


class CivicEduRepositoryImpl(
    private val dao: CivicEducationDAO
): CivicEduRepository {
    override suspend fun deleteAllCivicEdu() {
        dao.deleteAllCivicEdu()
    }

    override suspend fun addCivicEdu(addCivicEdu: List<CivicEdu>) {
        dao.addCivicEdu(addCivicEdu = addCivicEdu)
    }

    override fun getAYearCivicEdu(year: String): LiveData<CivicEdu> {
        return dao.getAYearCivicEdu(year = year)
    }



}