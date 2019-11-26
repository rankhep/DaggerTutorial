package com.example.daggertutorial

import com.example.daggertutorial.annotaion.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun getMainActivity(): MainActivity
}