package com.example.myapplication.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CinemaData(
    var name: String,
    var synopsis: String,
    var release : String,
    var images: Int,
    var highlight: String
): Parcelable