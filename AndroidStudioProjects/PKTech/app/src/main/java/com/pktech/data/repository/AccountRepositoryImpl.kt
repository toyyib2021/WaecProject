package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.domain.repository.AccountRepository


class AccountRepositoryImpl(
    private val dao: AccountDAO
): AccountRepository {
    override suspend fun deleteAllAccount() {
        dao.deleteAllAccount()
    }

    override suspend fun addAccount(addMath: List<Account>) {
        dao.addAccount(addAccount = addMath)
    }

    override fun getAYearAccount(year: String): LiveData<Account> {
        return dao.getAYearAccount(year = year)
    }


}