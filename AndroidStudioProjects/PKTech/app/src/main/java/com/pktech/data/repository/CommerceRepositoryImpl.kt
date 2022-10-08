package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Commerce
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.CommerceDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.CommerceRepository


class CommerceRepositoryImpl(
    private val dao: CommerceDAO
): CommerceRepository {
    override suspend fun deleteAllCommerce() {
        dao.deleteAllCommerce()
    }

    override suspend fun addCommerce(addCommerce: List<Commerce>) {
        dao.addCommerce(addCommerce = addCommerce)
    }

    override fun getAYearCommerce(year: String): LiveData<Commerce> {
        return dao.getAYearCommerce(year = year)
    }


}