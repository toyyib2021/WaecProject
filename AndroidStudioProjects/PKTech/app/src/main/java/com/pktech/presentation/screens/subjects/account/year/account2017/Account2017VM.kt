package com.pktech.presentation.screens.subjects.account.year.account2017


import androidx.lifecycle.*
import com.pktech.data.local.entity.Account
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.pktech.domain.repository.AccountRepository


@HiltViewModel
class Account2017VM @Inject constructor(
   private val accountRepository: AccountRepository,
):ViewModel() {

    var  getAccount2017: LiveData<Account> = accountRepository.getAYearAccount(year = "2017")

}

