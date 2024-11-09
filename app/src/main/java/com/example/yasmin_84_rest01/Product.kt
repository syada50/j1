package com.example.yasmin_84_rest01

import android.widget.ImageView

data class Product(
    var images:List<String>,
    val title:String,
    val price:Double,
    val description: String,
    val updatedAt: String,
)
