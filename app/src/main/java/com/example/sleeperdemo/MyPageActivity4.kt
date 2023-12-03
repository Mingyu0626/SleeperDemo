package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage3Binding
import com.example.sleeperdemo.databinding.ActivityMyPage4Binding

class MyPageActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMyPage4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPage4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myPageClick4.setOnClickListener {
            val intent = Intent(this@MyPageActivity4, MyTitleActivity1::class.java)
            startActivity(intent)
        }
    }
}