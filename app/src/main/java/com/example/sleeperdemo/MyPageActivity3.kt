package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage2Binding
import com.example.sleeperdemo.databinding.ActivityMyPage3Binding

class MyPageActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMyPage3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myPageClick3.setOnClickListener {
            val intent = Intent(this@MyPageActivity3, MyBadgeActivity1::class.java)
            startActivity(intent)
        }
    }
}