package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityRecordBinding
import com.example.sleeperdemo.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resultClick.setOnClickListener {
            val intent = Intent(this@ResultActivity, MainActivity3
            ::class.java)
            startActivity(intent)
        }
    }
}