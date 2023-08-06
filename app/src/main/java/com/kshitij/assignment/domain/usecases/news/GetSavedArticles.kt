package com.kshitij.assignment.domain.usecases.news

import com.kshitij.assignment.data.local.NewsDao
import com.kshitij.assignment.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}