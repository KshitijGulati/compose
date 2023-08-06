package com.kshitij.assignment.di

import com.kshitij.assignment.data.manger.LocalUserMangerImpl
import com.kshitij.assignment.domain.manger.LocalUserManger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MangerModule {

    @Binds
    @Singleton
    abstract fun bindLocalUserManger(localUserMangerImpl: LocalUserMangerImpl) : LocalUserManger
}