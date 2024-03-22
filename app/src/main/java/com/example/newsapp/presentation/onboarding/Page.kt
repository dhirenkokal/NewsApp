package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int
)

val pages = listOf(
    Page(
        title = "Hello Papa Here",
        description = "Demo text for the description",
        image = R.drawable.onboarding1
    ),

    Page(
        title = "Hello Mummy Here",
        description = "Demo text for the description",
        image = R.drawable.onboarding2
    ),

    Page(
        title = "Hello Sheryl Here",
        description = "Demo text for the description",
        image = R.drawable.onboarding3
    ),
)
