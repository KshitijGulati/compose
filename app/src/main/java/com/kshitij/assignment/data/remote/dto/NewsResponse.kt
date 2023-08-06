package com.kshitij.assignment.data.remote.dto

import com.kshitij.assignment.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)