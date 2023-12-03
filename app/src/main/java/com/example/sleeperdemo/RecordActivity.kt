package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMain2Binding
import com.example.sleeperdemo.databinding.ActivityRecordBinding

class RecordActivity : AppCompatActivity() {
    lateinit var binding: ActivityRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recordClick.setOnClickListener {
            val intent = Intent(this@RecordActivity, ResultActivity
            ::class.java)
            startActivity(intent)
        }
    }
}