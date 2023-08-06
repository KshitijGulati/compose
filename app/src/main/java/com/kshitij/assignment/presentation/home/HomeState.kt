package com.kshitij.assignment.presentation.home


data class HomeState(
    val newsTicker: String = "",
    val isLoading: Boolean = false,
)