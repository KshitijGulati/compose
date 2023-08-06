package com.kshitij.assignment.presentation.onboarding

import androidx.annotation.DrawableRes
import com.kshitij.assignment.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Just dummy pages of the app I am working on..",
        description = "This demo app contains news and option to bookmark news !!",
        image = R.drawable.housing_1
    ),
    Page(
        title = "Tech Used in this demo app",
        description = "MVVM and MVI, Paging3, Room, DataStorePreferences,Hilt,Theming.",
        image = R.drawable.housing_2
    ),
    Page(
        title = "Things in which it can be improved more",
        description = "Gradle version catalog, Multi Module, Compose Multiplatform(alpha):Kamel, Ktor,Moko-mvvm,PreCompose.",
        image = R.drawable.housing_3
    )
)