package com.example.daggertutorial

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App:DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}