package com.example.guideappstarting.dataclass

data class Place(
    val image: Int,
    val title: String,
    val detail: String,
    var visibility: Boolean = false,
    val text: String,
    val location: String
)
{
    var phoneNumber: String = ""

    constructor(image: Int,
                title: String,
                detail: String,
                visibility: Boolean = false,
                text: String,
                location: String,
                phoneNumber: String) : this(image, title, detail, visibility, text, location) {
                    this.phoneNumber = phoneNumber
                }
}