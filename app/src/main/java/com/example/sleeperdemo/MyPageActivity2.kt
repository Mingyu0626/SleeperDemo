package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage2Binding

class MyPageActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMyPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myPageClick2.setOnClickListener {
            val intent = Intent(this@MyPageActivity2, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}