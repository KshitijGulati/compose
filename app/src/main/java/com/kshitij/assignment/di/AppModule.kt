package com.kshitij.assignment.di

import android.app.Application
import androidx.room.Room
import com.kshitij.assignment.data.local.NewsDao
import com.kshitij.assignment.data.local.NewsDatabase
import com.kshitij.assignment.data.local.NewsTypeConvertor
import com.kshitij.assignment.data.manger.LocalUserMangerImpl
import com.kshitij.assignment.data.remote.NewsApi
import com.kshitij.assignment.domain.manger.LocalUserManger
import com.kshitij.assignment.domain.usecases.app_entry.ReadAppEntry
import com.kshitij.assignment.domain.usecases.app_entry.SaveAppEntry
import com.kshitij.assignment.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideApiInstance(): NewsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(
        application: Application
    ): NewsDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = NewsDatabase::class.java,
            name = "news_db"
        ).addTypeConverter(NewsTypeConvertor())
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDatabase: NewsDatabase
    ): NewsDao = newsDatabase.newsDao

}