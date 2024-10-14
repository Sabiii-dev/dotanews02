package com.example.dotanews02

import android.os.Parcel
import android.os.Parcelable


data class ModelClass(
    val image: Int,
    val date: String,
    val title: String,
//    val description: String,
    val detailImage: Int,
    val detailTitle: String,
    val detailDesc: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
      //  parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(date)
        parcel.writeString(title)
       // parcel.writeString(description)
        parcel.writeInt(detailImage)
        parcel.writeString(detailTitle)
        parcel.writeString(detailDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelClass> {
        override fun createFromParcel(parcel: Parcel): ModelClass {
            return ModelClass(parcel)
        }

        override fun newArray(size: Int): Array<ModelClass?> {
            return arrayOfNulls(size)
        }
    }
}