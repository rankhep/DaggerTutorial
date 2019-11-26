package com.example.daggertutorial

import androidx.databinding.DataBindingUtil
import com.example.daggertutorial.annotaion.ActivityScope
import com.example.daggertutorial.databinding.ActivityMainBinding
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity): ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_main)
        }
    }
}