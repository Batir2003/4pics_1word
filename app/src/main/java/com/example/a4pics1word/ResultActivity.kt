package com.example.a4pics1word

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4pics1word.databinding.ActivityMainBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}