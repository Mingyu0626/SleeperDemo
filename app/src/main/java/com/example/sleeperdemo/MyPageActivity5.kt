package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage4Binding
import com.example.sleeperdemo.databinding.ActivityMyPage5Binding

class MyPageActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMyPage5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPage5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myPageClick5.setOnClickListener {
            val intent = Intent(this@MyPageActivity5, MyReportActivity2::class.java)
            startActivity(intent)
        }
    }
}