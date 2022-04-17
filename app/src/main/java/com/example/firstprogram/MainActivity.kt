package com.example.firstprogram

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.firstprogram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        val buildType = BuildConfig.BUILD_TYPE
        val flavor = BuildConfig.FLAVOR
        val versionName = BuildConfig.VERSION_NAME
        val baseUrl = BuildConfig.BASE_URL
        binding.tv.text = "$buildType\n$flavor\n$versionName\n$baseUrl"
    }
}