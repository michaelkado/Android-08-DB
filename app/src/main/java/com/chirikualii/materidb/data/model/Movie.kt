package com.chirikualii.materidb.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie (
    val title:String,
    val relaseDate:String,
    val imagePoster:String,
    val backdrop:String,
    val overview:String
) :Parcelable