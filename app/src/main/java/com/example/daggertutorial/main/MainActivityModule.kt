package com.example.daggertutorial.main

import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import com.example.daggertutorial.R
import com.example.daggertutorial.annotaion.ActivityScope
import com.example.daggertutorial.annotaion.FragmentScope
import com.example.daggertutorial.databinding.ActivityMainBinding
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity): ActivityMainBinding {
            return DataBindingUtil.setContentView(
                activity,
                R.layout.activity_main
            )
        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [(MainFragmentModule::class)])
    abstract fun getMainFragment(): MainFragment
}