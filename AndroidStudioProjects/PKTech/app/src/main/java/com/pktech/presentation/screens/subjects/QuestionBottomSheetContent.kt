package com.pktech.presentation.screens.subjects

import com.pktech.domain.model.QuestionIndexSheetDataClass
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White

fun questionIndexSheetRepo(optionSelectState: List<String>): List<QuestionIndexSheetDataClass> {

    val questionIndexSheetList = listOf<QuestionIndexSheetDataClass>(
        QuestionIndexSheetDataClass(
            id = 1,
            bgColor = when (optionSelectState[0]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[0]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 2,
            bgColor = when (optionSelectState[1]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[1]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 3,
            bgColor = when (optionSelectState[2]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[2]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 4,
            bgColor = when (optionSelectState[3]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[3]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 5,
            bgColor = when (optionSelectState[4]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[4]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 6,
            bgColor = when (optionSelectState[5]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[5]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 7,
            bgColor = when (optionSelectState[6]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[6]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 8,
            bgColor = when (optionSelectState[7]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[7]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 9,
            bgColor = when (optionSelectState[8]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[8]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 10,
            bgColor = when (optionSelectState[9]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[9]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 11,
            bgColor = when (optionSelectState[10]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[0]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 12,
            bgColor = when (optionSelectState[11]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[11]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 13,
            bgColor = when (optionSelectState[12]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[12]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 14,
            bgColor = when (optionSelectState[13]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[13]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 15,
            bgColor = when (optionSelectState[14]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[14]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 16,
            bgColor = when (optionSelectState[15]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[15]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 17,
            bgColor = when (optionSelectState[16]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[16]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 18,
            bgColor = when (optionSelectState[17]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[17]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 19,
            bgColor = when (optionSelectState[18]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[18]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 20,
            bgColor = when (optionSelectState[19]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[19]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 21,
            bgColor = when (optionSelectState[20]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[20]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 22,
            bgColor = when (optionSelectState[21]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[21]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 23,
            bgColor = when (optionSelectState[22]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[22]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 24,
            bgColor = when (optionSelectState[23]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[23]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 25,
            bgColor = when (optionSelectState[24]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[24]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 26,
            bgColor = when (optionSelectState[25]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[25]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 27,
            bgColor = when (optionSelectState[26]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[26]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 28,
            bgColor = when (optionSelectState[27]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[27]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 29,
            bgColor = when (optionSelectState[28]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[28]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 30,
            bgColor = when (optionSelectState[29]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[29]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 31,
            bgColor = when (optionSelectState[30]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[30]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 32,
            bgColor = when (optionSelectState[31]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[31]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 33,
            bgColor = when (optionSelectState[32]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[32]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 34,
            bgColor = when (optionSelectState[33]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[33]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 35,
            bgColor = when (optionSelectState[34]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[34]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 36,
            bgColor = when (optionSelectState[35]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[35]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 37,
            bgColor = when (optionSelectState[36]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[36]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 38,
            bgColor = when (optionSelectState[37]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[37]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 39,
            bgColor = when (optionSelectState[38]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[38]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 40,
            bgColor = when (optionSelectState[39]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[39]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 41,
            bgColor = when (optionSelectState[40]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[40]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 42,
            bgColor = when (optionSelectState[41]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[41]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 43,
            bgColor = when (optionSelectState[42]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[42]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 44,
            bgColor = when (optionSelectState[43]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[43]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 45,
            bgColor = when (optionSelectState[44]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[44]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 46,
            bgColor = when (optionSelectState[45]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[45]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 47,
            bgColor = when (optionSelectState[46]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[46]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 48,
            bgColor = when (optionSelectState[47]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[47]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 49,
            bgColor = when (optionSelectState[48]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[48]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 50,
            bgColor = when (optionSelectState[49]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[49]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),

    )




    return questionIndexSheetList
}

fun questionIndexSheetRepoEng(optionSelectState: List<String>): List<QuestionIndexSheetDataClass> {
    val questionIndexSheetEnglish = listOf<QuestionIndexSheetDataClass>(
        QuestionIndexSheetDataClass(
            id = 1,
            bgColor = when (optionSelectState[0]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[0]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 2,
            bgColor = when (optionSelectState[1]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[1]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 3,
            bgColor = when (optionSelectState[2]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[2]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 4,
            bgColor = when (optionSelectState[3]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[3]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 5,
            bgColor = when (optionSelectState[4]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[4]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 6,
            bgColor = when (optionSelectState[5]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[5]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 7,
            bgColor = when (optionSelectState[6]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[6]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 8,
            bgColor = when (optionSelectState[7]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[7]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 9,
            bgColor = when (optionSelectState[8]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[8]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 10,
            bgColor = when (optionSelectState[9]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[9]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 11,
            bgColor = when (optionSelectState[10]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[0]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 12,
            bgColor = when (optionSelectState[11]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[11]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 13,
            bgColor = when (optionSelectState[12]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[12]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 14,
            bgColor = when (optionSelectState[13]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[13]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 15,
            bgColor = when (optionSelectState[14]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[14]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 16,
            bgColor = when (optionSelectState[15]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[15]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 17,
            bgColor = when (optionSelectState[16]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[16]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 18,
            bgColor = when (optionSelectState[17]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[17]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 19,
            bgColor = when (optionSelectState[18]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[18]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 20,
            bgColor = when (optionSelectState[19]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[19]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 21,
            bgColor = when (optionSelectState[20]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[20]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 22,
            bgColor = when (optionSelectState[21]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[21]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 23,
            bgColor = when (optionSelectState[22]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[22]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 24,
            bgColor = when (optionSelectState[23]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[23]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 25,
            bgColor = when (optionSelectState[24]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[24]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 26,
            bgColor = when (optionSelectState[25]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[25]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 27,
            bgColor = when (optionSelectState[26]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[26]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 28,
            bgColor = when (optionSelectState[27]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[27]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 29,
            bgColor = when (optionSelectState[28]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[28]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 30,
            bgColor = when (optionSelectState[29]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[29]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 31,
            bgColor = when (optionSelectState[30]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[30]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 32,
            bgColor = when (optionSelectState[31]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[31]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 33,
            bgColor = when (optionSelectState[32]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[32]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 34,
            bgColor = when (optionSelectState[33]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[33]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 35,
            bgColor = when (optionSelectState[34]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[34]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 36,
            bgColor = when (optionSelectState[35]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[35]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 37,
            bgColor = when (optionSelectState[36]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[36]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 38,
            bgColor = when (optionSelectState[37]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[37]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 39,
            bgColor = when (optionSelectState[38]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[38]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 40,
            bgColor = when (optionSelectState[39]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[39]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 41,
            bgColor = when (optionSelectState[40]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[40]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 42,
            bgColor = when (optionSelectState[41]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[41]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 43,
            bgColor = when (optionSelectState[42]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[42]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 44,
            bgColor = when (optionSelectState[43]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[43]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 45,
            bgColor = when (optionSelectState[44]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[44]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 46,
            bgColor = when (optionSelectState[45]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[45]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 47,
            bgColor = when (optionSelectState[46]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[46]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 48,
            bgColor = when (optionSelectState[47]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[47]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 49,
            bgColor = when (optionSelectState[48]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[48]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 50,
            bgColor = when (optionSelectState[49]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[49]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),

        /////   :::::::::::::::::::::::::::::::50:::::::::::::::::::::::::::: //////
        QuestionIndexSheetDataClass(
            id = 51,
            bgColor = when (optionSelectState[50]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[50]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 52,
            bgColor = when (optionSelectState[51]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[51]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 53,
            bgColor = when (optionSelectState[52]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[52]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 54,
            bgColor = when (optionSelectState[53]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[53]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 55,
            bgColor = when (optionSelectState[54]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[54]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 56,
            bgColor = when (optionSelectState[55]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[55]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 57,
            bgColor = when (optionSelectState[56]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[56]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 58,
            bgColor = when (optionSelectState[57]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[57]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 59,
            bgColor = when (optionSelectState[58]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[58]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 60,
            bgColor = when (optionSelectState[59]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[59]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 71,
            bgColor = when (optionSelectState[70]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[70]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 72,
            bgColor = when (optionSelectState[71]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[71]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 73,
            bgColor = when (optionSelectState[72]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[72]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 74,
            bgColor = when (optionSelectState[73]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[73]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 75,
            bgColor = when (optionSelectState[74]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[74]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 76,
            bgColor = when (optionSelectState[75]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[75]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 77,
            bgColor = when (optionSelectState[76]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[76]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 78,
            bgColor = when (optionSelectState[77]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[77]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 79,
            bgColor = when (optionSelectState[78]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[78]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 80,
            bgColor = when (optionSelectState[79]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[79]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 81,
            bgColor = when (optionSelectState[80]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[80]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 82,
            bgColor = when (optionSelectState[81]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[81]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 83,
            bgColor = when (optionSelectState[82]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[82]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 84,
            bgColor = when (optionSelectState[83]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[83]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 85,
            bgColor = when (optionSelectState[84]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[84]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 86,
            bgColor = when (optionSelectState[85]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[85]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 87,
            bgColor = when (optionSelectState[86]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[86]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 88,
            bgColor = when (optionSelectState[87]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[87]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 89,
            bgColor = when (optionSelectState[88]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[88]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 90,
            bgColor = when (optionSelectState[89]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[89]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 91,
            bgColor = when (optionSelectState[90]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[90]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 92,
            bgColor = when (optionSelectState[91]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[91]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 93,
            bgColor = when (optionSelectState[92]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[92]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 94,
            bgColor = when (optionSelectState[93]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[93]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 95,
            bgColor = when (optionSelectState[94]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[94]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),
        QuestionIndexSheetDataClass(
            id = 96,
            bgColor = when (optionSelectState[95]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[95]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 97,
            bgColor = when (optionSelectState[96]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[96]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 98,
            bgColor = when (optionSelectState[97]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[97]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 99,
            bgColor = when (optionSelectState[98]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[98]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),QuestionIndexSheetDataClass(
            id = 100,
            bgColor = when (optionSelectState[99]) {
                "" -> White
                else -> {
                    VeryDarkGray
                }
            },
            txColor = when (optionSelectState[99]) {
                "" -> VeryDarkGray
                else -> {
                    White
                }
            }
        ),


        )
    return questionIndexSheetEnglish
}


