package com.kshitij.assignment.presentation.bookmark

import com.kshitij.assignment.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)