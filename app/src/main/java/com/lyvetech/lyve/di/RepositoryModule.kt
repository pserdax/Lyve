package com.lyvetech.lyve.di

import com.lyvetech.lyve.repositories.LyveRepository
import com.lyvetech.lyve.repositories.LyveRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(
        lyveRepositoryImpl: LyveRepositoryImpl
    ): LyveRepository
}