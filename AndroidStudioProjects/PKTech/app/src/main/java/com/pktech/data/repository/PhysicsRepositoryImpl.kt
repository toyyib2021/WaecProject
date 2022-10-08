package com.pktech.data.repository


import androidx.lifecycle.LiveData
import com.pktech.data.local.entity.Account
import com.pktech.data.local.entity.Physics
import com.pktech.data.local.entity.dao.AccountDAO
import com.pktech.data.local.entity.dao.PhysicsDAO
import com.pktech.domain.repository.AccountRepository
import com.pktech.domain.repository.PhysicsRepository


class PhysicsRepositoryImpl(
    private val dao: PhysicsDAO
): PhysicsRepository {
    override suspend fun deleteAllPhysics() {
        dao.deleteAllPhysics()
    }

    override suspend fun addPhysics(addPhysics: List<Physics>) {
        dao.addPhysics(addPhysics = addPhysics)
    }

    override fun getAYearPhysics(year: String): LiveData<Physics> {
        return  dao.getAYearPhysics(year = year)
    }


}