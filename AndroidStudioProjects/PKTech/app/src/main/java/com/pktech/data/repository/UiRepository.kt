package com.pktech.data.repository

import com.pktech.R
import com.pktech.data.local.entity.SelectedOptionDB
import com.pktech.domain.model.UiDataClass
import com.pktech.ui.theme.*

class UiRepository {

    val uiDataClassRepos = listOf<UiDataClass>(
        UiDataClass(
            1,
            "Study past papers",
            "Study past papers using the year of your chioce",
            null,
            R.drawable.study_image
        ),
        UiDataClass(
            2,
            "Study past papers",
            "Study past papers using the topic of your chioce",
            null,
            R.drawable.study_image
        ),

        UiDataClass(
            3,
            "Take a Test",
            "Test your performance  using the year of your choice",
            null,
            R.drawable.test_image
        ),

        UiDataClass(
            4,
            "Take a Test",
            "Test your performance  using the topic of your choice",
            null,
            R.drawable.test_image
        )

    )
    val saveQuestionAndOthers = listOf<UiDataClass>(
        UiDataClass(
            1,
            "Saved Questions",
            "view questions save as bookmarks during you studies",
            PurePink,
            R.drawable.save_question
        ),
        UiDataClass(
            2,
            "Literary Texts",
            "Novels, dramas and poetry from 2021 - 2025",
            DarkBlue,
            R.drawable.lit_test
        )
    )
    val subjects = listOf<UiDataClass>(
        UiDataClass(
            1,
            "English Language",
            "",
            PurePink,
            R.drawable.icons_english_language
        ),
        UiDataClass(
            2,
            "Mathematics",
            "",
            LightBlue,
            R.drawable.icons_mathematic
        ),
        UiDataClass(
            3,
            "Economics",
            "",
            VividOrange,
            R.drawable.icons_economics
        ),
        UiDataClass(
            4,
            "Civic Education",
            "",
            VividOrange2,
            R.drawable.icons_law
        ),
        UiDataClass(
            5,
            "Biology",
            "",
            DarkBlue,
            R.drawable.icons_biology
        ),
        UiDataClass(
            6,
            "Commerce",
            "",
            VeryDarkGray,
            R.drawable.icons_commerce
        ),
        UiDataClass(
            7,
            "Accounting",
            "",
            VividOrange,
            R.drawable.icons_accounting
        ),
        UiDataClass(
            8,
            "Physics",
            "",
            StrongBlue2,
            R.drawable.icons_physicist
        ),
        UiDataClass(
            9,
            "Agric Science",
            "",
            PurePink,
            R.drawable.icons_agriculture
        ),
        UiDataClass(
            10,
            "Lit-in-Eng",
            "",
            VividOrange2,
            R.drawable.icons_literary
        ),
        UiDataClass(
            11,
            "Chemistry",
            "",
            DarkBlue,
            R.drawable.icons_chemistry
        ),
        UiDataClass(
            12,
            "Government",
            "",
            VeryDarkGray,
            R.drawable.icons_law
        ),
        UiDataClass(
            13,
            "Marketing",
            "",
            StrongBlue2,
            R.drawable.icons_commerce
        ),
    )
    val years = listOf<Years>(
        Years(1, "2012"),
        Years(2, "2013"),
        Years(3, "2014"),
        Years(4, "2015"),
        Years(5, "2016"),
        Years(6, "2017"),
        Years(7, "2018"),
        Years(8, "2019"),
        Years(9, "2010"),
        Years(10, "2021"),
        Years(11, "2022")
    )
    val selectedSubjectObj = listOf<String>(
        "English Objective",
        "Mathematics Objective",
        "Economics Objective",
        "Civic Education Objective",
       " Biology Objective",
        "Commerce Objective",
        "Accounting Objective",
        "Physics Objective",
        "Agric Science Objective",
        "Lit-In-Eng Objective",
        "Chemistry Objective",
        "Government Objective",
        "Marketing Objective"
    )
    val selectedSubjectThy = listOf<String>(
        "English Theory",
        "Mathematics Theory",
        "Economics Theory",
        "Civic Education Theory",
        "Biology Theory",
        "Commerce Theory",
        "Accounting Theory",
        "Physics Theory",
        "Agric Science Theory",
        "Lit-In-Eng Theory",
        "Chemistry Theory",
        "Government Theory",
        "Marketing Theory"
    )

    val emptySelectedOptionList = listOf<SelectedOptionDB>(
        SelectedOptionDB(1, ""),
        SelectedOptionDB(2, ""),
        SelectedOptionDB(3, ""),
        SelectedOptionDB(4, ""),
        SelectedOptionDB(5, ""),
        SelectedOptionDB(6, ""),
        SelectedOptionDB(7, ""),
        SelectedOptionDB(8, ""),
        SelectedOptionDB(9, ""),
        SelectedOptionDB(10, ""),
        SelectedOptionDB(11, ""),
        SelectedOptionDB(12, ""),
        SelectedOptionDB(13, ""),
        SelectedOptionDB(14, ""),
        SelectedOptionDB(15, ""),
        SelectedOptionDB(16, ""),
        SelectedOptionDB(17, ""),
        SelectedOptionDB(18, ""),
        SelectedOptionDB(19, ""),
        SelectedOptionDB(20, ""),
        SelectedOptionDB(21, ""),
        SelectedOptionDB(22, ""),
        SelectedOptionDB(23, ""),
        SelectedOptionDB(24, ""),
        SelectedOptionDB(25, ""),
        SelectedOptionDB(26, ""),
        SelectedOptionDB(27, ""),
        SelectedOptionDB(28, ""),
        SelectedOptionDB(29, ""),
        SelectedOptionDB(30, ""),
        SelectedOptionDB(31, ""),
        SelectedOptionDB(32, ""),
        SelectedOptionDB(33, ""),
        SelectedOptionDB(34, ""),
        SelectedOptionDB(35, ""),
        SelectedOptionDB(36, ""),
        SelectedOptionDB(37, ""),
        SelectedOptionDB(38, ""),
        SelectedOptionDB(39, ""),
        SelectedOptionDB(40, ""),
        SelectedOptionDB(41, ""),
        SelectedOptionDB(42, ""),
        SelectedOptionDB(43, ""),
        SelectedOptionDB(44, ""),
        SelectedOptionDB(45, ""),
        SelectedOptionDB(46, ""),
        SelectedOptionDB(47, ""),
        SelectedOptionDB(48, ""),
        SelectedOptionDB(49, ""),
        SelectedOptionDB(50, ""),
        SelectedOptionDB(51, ""),
        SelectedOptionDB(52, ""),
        SelectedOptionDB(53, ""),
        SelectedOptionDB(54, ""),
        SelectedOptionDB(55, ""),
        SelectedOptionDB(56, ""),
        SelectedOptionDB(57, ""),
        SelectedOptionDB(58, ""),
        SelectedOptionDB(59, ""),
        SelectedOptionDB(60, ""),
        SelectedOptionDB(61, ""),
        SelectedOptionDB(62, ""),
        SelectedOptionDB(63, ""),
        SelectedOptionDB(64, ""),
        SelectedOptionDB(65, ""),
        SelectedOptionDB(66, ""),
        SelectedOptionDB(67, ""),
        SelectedOptionDB(68, ""),
        SelectedOptionDB(69, ""),
        SelectedOptionDB(70, ""),
        SelectedOptionDB(71, ""),
        SelectedOptionDB(72, ""),
        SelectedOptionDB(73, ""),
        SelectedOptionDB(74, ""),
        SelectedOptionDB(75, ""),
        SelectedOptionDB(76, ""),
        SelectedOptionDB(77, ""),
        SelectedOptionDB(78, ""),
        SelectedOptionDB(79, ""),
        SelectedOptionDB(80, ""),
        SelectedOptionDB(81, ""),
        SelectedOptionDB(82, ""),
        SelectedOptionDB(83, ""),
        SelectedOptionDB(84, ""),
        SelectedOptionDB(85, ""),
        SelectedOptionDB(86, ""),
        SelectedOptionDB(87, ""),
        SelectedOptionDB(88, ""),
        SelectedOptionDB(89, ""),
        SelectedOptionDB(90, ""),
        SelectedOptionDB(91, ""),
        SelectedOptionDB(92, ""),
        SelectedOptionDB(93, ""),
        SelectedOptionDB(94, ""),
        SelectedOptionDB(95, ""),
        SelectedOptionDB(96, ""),
        SelectedOptionDB(97, ""),
        SelectedOptionDB(98, ""),
        SelectedOptionDB(99, ""),
        SelectedOptionDB(100, ""),

    )

    private val op = listOf<String>( "A", "B", "C", "D")

    val alphabetOptions = listOf<Options>(
        Options(1, options = op ),
        Options(2, options = op ),
        Options(3, options = op ),
        Options(4, options = op ),
        Options(5, options = op ),
        Options(6, options = op ),
        Options(7, options = op ),
        Options(8, options = op ),
        Options(9, options = op ),
        Options(10, options = op ),
        Options(11, options = op ),
        Options(12, options = op ),
        Options(13, options = op ),
        Options(14, options = op ),
        Options(15, options = op ),
        Options(16, options = op ),
        Options(17, options = op ),
        Options(18, options = op ),
        Options(19, options = op ),
        Options(20, options = op ),
        Options(21, options = op ),
        Options(22, options = op ),
        Options(23, options = op ),
        Options(24, options = op ),
        Options(25, options = op ),
        Options(26, options = op ),
        Options(27, options = op ),
        Options(28, options = op ),
        Options(29, options = op ),
        Options(30, options = op ),
        Options(31, options = op ),
        Options(32, options = op ),
        Options(33, options = op ),
        Options(34, options = op ),
        Options(35, options = op ),
        Options(36, options = op ),
        Options(37, options = op ),
        Options(38, options = op ),
        Options(39, options = op ),
        Options(40, options = op ),
        Options(41, options = op ),
        Options(42, options = op ),
        Options(43, options = op ),
        Options(44, options = op ),
        Options(45, options = op ),
        Options(46, options = op ),
        Options(47, options = op ),
        Options(48, options = op ),
        Options(49, options = op ),
        Options(50, options = op ),
        Options(51, options = op ),
        Options(52, options = op ),
        Options(53, options = op ),
        Options(54, options = op ),
        Options(55, options = op ),
        Options(56, options = op ),
        Options(57, options = op ),
        Options(58, options = op ),
        Options(59, options = op ),
        Options(60, options = op ),
        Options(61, options = op ),
        Options(62, options = op ),
        Options(63, options = op ),
        Options(64, options = op ),
        Options(65, options = op ),
        Options(66, options = op ),
        Options(67, options = op ),
        Options(68, options = op ),
        Options(69, options = op ),
        Options(70, options = op ),
        Options(71, options = op ),
        Options(72, options = op ),
        Options(73, options = op ),
        Options(74, options = op ),
        Options(75, options = op ),
        Options(76, options = op ),
        Options(77, options = op ),
        Options(78, options = op ),
        Options(79, options = op ),
        Options(80, options = op ),
        Options(81, options = op ),
        Options(82, options = op ),
        Options(83, options = op ),
        Options(84, options = op ),
        Options(85, options = op ),
        Options(86, options = op ),
        Options(87, options = op ),
        Options(88, options = op ),
        Options(89, options = op ),
        Options(90, options = op ),
        Options(91, options = op ),
        Options(92, options = op ),
        Options(93, options = op ),
        Options(94, options = op ),
        Options(95, options = op ),
        Options(96, options = op ),
        Options(97, options = op ),
        Options(98, options = op ),
        Options(99, options = op ),
        Options(100, options = op ),
    )



}
data class Years (val id: Int, val years: String)
data class Options ( val id: Int, val options: List<String> )




