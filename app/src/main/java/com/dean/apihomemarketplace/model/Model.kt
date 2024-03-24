package com.dean.apihomemarketplace.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Model(
    var title: String,
    var desc: String,
    var address: String,
    var image : Int


) : Parcelable
