package com.example.mypackage.view.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mypackage.R


class MainScreenFragment : Fragment() {

    private lateinit var viewModel: MainScreenViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(MainScreenViewModel::class.java)
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }

}