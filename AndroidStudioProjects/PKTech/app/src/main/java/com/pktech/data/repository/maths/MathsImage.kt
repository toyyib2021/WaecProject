package com.pktech.data.repository.maths

import android.graphics.Bitmap

data class ImageObjAndThy(
    val obj: Bitmap? = null,
    val thy: Bitmap? = null
        )
class MathsImage {
    val mathImage2012 = listOf<ImageObjAndThy>(
        ImageObjAndThy(obj = null, thy = null)
    )
}