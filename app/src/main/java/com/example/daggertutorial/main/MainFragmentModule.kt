package com.example.daggertutorial.main

import androidx.databinding.DataBindingUtil
import com.example.daggertutorial.R
import com.example.daggertutorial.annotaion.FragmentScope
import com.example.daggertutorial.databinding.FragmentMainBinding
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {
    @FragmentScope
    @Provides
    fun provideMainFragmentBinding(activity: MainActivity): FragmentMainBinding {
        return DataBindingUtil.inflate<FragmentMainBinding>(
            activity.layoutInflater,
            R.layout.fragment_main,
            null,
            false
        )
    }
}