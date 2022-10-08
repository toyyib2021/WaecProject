package com.pktech.data.repository

import android.content.Context
import com.pktech.data.local.entity.ImageDB

class AllImage {

     suspend fun addingAllImage(context: Context): List<ImageDB> {

        val urlToBitmap = UrlToBitmap()
             val allImage = listOf<ImageDB>(

  /////////////////////////////// ::: MATHEMATICS OBJECTIVE QUESTIONS::: //////////////////////////////////////////////
                ImageDB(id = "mathObjQuestion1", bitmap = urlToBitmap.getBitmap1(context = context)),
                ImageDB(id = "mathObjQuestion2", bitmap = urlToBitmap.getBitmap2(context = context)),
                ImageDB(id = "mathObjQuestion3", bitmap = urlToBitmap.getBitmap3(context = context)),
                ImageDB(id = "mathObjQuestion4", bitmap = urlToBitmap.getBitmap4(context = context)),
                ImageDB(id = "mathObjQuestion5", bitmap = urlToBitmap.getBitmap5(context = context)),
                ImageDB(id = "mathObjQuestion6", bitmap = urlToBitmap.getBitmap6(context = context)),
                ImageDB(id = "mathObjQuestion7", bitmap = urlToBitmap.getBitmap7(context = context)),
                ImageDB(id = "mathObjQuestion8", bitmap = urlToBitmap.getBitmap8(context = context)),
                ImageDB(id = "mathObjQuestion9", bitmap = urlToBitmap.getBitmap9(context = context)),
                ImageDB(id = "mathObjQuestion10", bitmap = urlToBitmap.getBitmap10(context = context)),
                ImageDB(id = "mathObjQuestion11", bitmap = urlToBitmap.getBitmap11(context = context)),
                ImageDB(id = "mathObjQuestion12", bitmap = urlToBitmap.getBitmap12(context = context)),
                ImageDB(id = "mathObjQuestion13", bitmap = urlToBitmap.getBitmap13(context = context)),


/////////////////////////////// ::: MATHEMATICS OBJECTIVE ANSWERS::: //////////////////////////////////////////////
                ImageDB(id = "2", bitmap = urlToBitmap.getBitmap14(context = context)),
                ImageDB(id = "2", bitmap = urlToBitmap.getBitmap15(context = context)),



   /////////////////////////////// ::: MATHEMATICS THEORY QUESTIONS::: //////////////////////////////////////////////
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap16(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap17(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap18(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap19(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap20(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap21(context = context)),



  /////////////////////////////// ::: MATHEMATICS THEORY ANSWERS::: //////////////////////////////////////////////
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap22(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap23(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap24(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap25(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap26(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap27(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap28(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap29(context = context)),
                 ImageDB(id = "2", bitmap = urlToBitmap.getBitmap30(context = context)),
             )



         return allImage
        }
 }
