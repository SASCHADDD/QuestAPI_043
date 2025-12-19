package com.example.pertemuan12

import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id : Int,
    val nama : String,
    val alamat : String,
    val telpon : String
)

data class UiStateSiswa(
    val detailSiswa: Detail
)