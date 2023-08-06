package com.kshitij.assignment.presentation.search

import androidx.paging.PagingData
import com.kshitij.assignment.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)