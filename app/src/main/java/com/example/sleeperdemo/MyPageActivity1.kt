package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage1Binding
import com.example.sleeperdemo.databinding.ActivityMyReport1Binding

class MyPageActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMyPage1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPage1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myPageClick1.setOnClickListener {
            val intent = Intent(this@MyPageActivity1, MyReportActivity1::class.java)
            startActivity(intent)
        }
    }
}