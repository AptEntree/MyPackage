package com.example.mypackage.view

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.mypackage.R

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}