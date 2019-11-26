package com.example.daggertutorial

import com.example.daggertutorial.annotaion.ActivityScope
import com.example.daggertutorial.main.MainActivity
import com.example.daggertutorial.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun getMainActivity(): MainActivity
}