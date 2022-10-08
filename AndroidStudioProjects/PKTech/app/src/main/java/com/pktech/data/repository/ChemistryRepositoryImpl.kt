package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Chemistry
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.ChemistryDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.ChemistryRepository


class ChemistryRepositoryImpl(
    private val dao: ChemistryDAO
): ChemistryRepository {
    override suspend fun deleteAllChemistry() {
        dao.deleteAllChemistry()
    }

    override suspend fun addChemistry(addChemistry: List<Chemistry>) {
        dao.addChemistry(addChemistry = addChemistry)
    }

    override fun getAYearChemistry(year: String): LiveData<Chemistry> {
        return dao.getAYearChemistry(year = year)
    }


}