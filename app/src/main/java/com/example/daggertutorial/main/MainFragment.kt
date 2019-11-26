package com.example.daggertutorial.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.daggertutorial.databinding.FragmentMainBinding
import javax.inject.Inject

class MainFragment : dagger.android.support.DaggerFragment() {
    @Inject
    lateinit var binding: FragmentMainBinding

    @Inject
    lateinit var helloWorld: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "asdasd"
    }
}