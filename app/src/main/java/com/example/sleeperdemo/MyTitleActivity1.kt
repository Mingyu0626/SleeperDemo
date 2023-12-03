package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyPage3Binding
import com.example.sleeperdemo.databinding.ActivityMyTitle1Binding

class MyTitleActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMyTitle1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyTitle1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myTitleClick1.setOnClickListener {
            val intent = Intent(this@MyTitleActivity1, MyPageActivity5::class.java)
            startActivity(intent)
        }
    }
}