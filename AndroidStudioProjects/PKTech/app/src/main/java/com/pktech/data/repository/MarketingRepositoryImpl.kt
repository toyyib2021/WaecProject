package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Marketing
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.MarketingDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.MarketingRepository


class MarketingRepositoryImpl(
    private val dao: MarketingDAO
): MarketingRepository {
    override suspend fun deleteAllMarketing() {
        dao.deleteAllMarketing()
    }

    override suspend fun addMarketing(addMarketing: List<Marketing>) {
        dao.addMarketing(addMarketing = addMarketing)
    }

    override fun getAYearMarketing(year: String): LiveData<Marketing> {
       return dao.getAYearMarketing(year = year)
    }


}