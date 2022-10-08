package com.pktech.data.repository.english

import com.pktech.domain.model.Questions

class EnglishAllYear {

    fun englishAllYear(): List<List<Questions>> {

        val english2013 = English2013Repo()

        val englishYear = listOf<List<Questions>>(
            english2013.english2013
        )

        return englishYear
    }
}