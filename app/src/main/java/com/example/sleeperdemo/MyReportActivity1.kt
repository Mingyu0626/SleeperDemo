package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMission2Binding
import com.example.sleeperdemo.databinding.ActivityMyReport1Binding

class MyReportActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMyReport1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyReport1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myReportClick1.setOnClickListener {
            val intent = Intent(this@MyReportActivity1, MyPageActivity2::class.java)
            startActivity(intent)
        }
    }
}