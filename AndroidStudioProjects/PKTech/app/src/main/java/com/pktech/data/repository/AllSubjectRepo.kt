package com.pktech.data.repository

import com.pktech.data.local.entity.Subjects
import com.pktech.data.repository.english.EnglishRepo
import com.pktech.data.repository.maths.MathsRepoDB

class AllSubjectRepo {

    private val englishRepo = EnglishRepo()
    private val mathsRepoDB = MathsRepoDB()

    val allSubjectRepo = listOf<Subjects>(
        Subjects(
            subject = englishRepo.englishYear,
            id = 1
        ),
        Subjects(
            subject = mathsRepoDB.mathYear,
            id = 2
        ),
        

    )

}