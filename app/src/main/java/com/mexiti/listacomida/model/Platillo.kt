package com.mexiti.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*
  a
 */

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int
)
