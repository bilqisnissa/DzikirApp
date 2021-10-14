package com.muflihunnisa.dzikirapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    val imageArtikel : Int,
    val titleartikel : String,
    val descArtikel : String
): Parcelable
