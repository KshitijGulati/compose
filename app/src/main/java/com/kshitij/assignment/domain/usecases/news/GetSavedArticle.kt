package com.kshitij.assignment.domain.usecases.news

import com.kshitij.assignment.data.local.NewsDao
import com.kshitij.assignment.domain.model.Article
import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url = url)
    }

}