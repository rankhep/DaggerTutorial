package com.example.daggertutorial

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideHelloWorld() = "Hello World!!"
}