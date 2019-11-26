package com.example.daggertutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggertutorial.databinding.ActivityMainBinding
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    @Inject
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate", binding.toString())
    }
}
