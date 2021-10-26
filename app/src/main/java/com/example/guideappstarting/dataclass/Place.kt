package com.example.guideappstarting.dataclass

data class Place(
    val image: Int,
    val title: String,
    val detail: String,
    var visibility: Boolean = false,
    val text: String,
    val location: String,
    val phoneNumber: String
)