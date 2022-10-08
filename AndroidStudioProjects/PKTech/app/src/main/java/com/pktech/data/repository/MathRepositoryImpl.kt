package com.pktech.data.repository

import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Maths
import com.pktech.data.local.entity.dao.MathDAO
import com.pktech.domain.repository.MathRepository

class MathRepositoryImpl(
    private val dao: MathDAO
): MathRepository {
    override suspend fun deleteAll() {
        dao.deleteAll()
    }

    override suspend fun addMaths(addMaths: List<Maths>) {
        dao.addMaths(addMath = addMaths)
    }

    override fun getAYear(year: String): LiveData<Maths> {
        return  dao.getAYear(year = year)
    }


}