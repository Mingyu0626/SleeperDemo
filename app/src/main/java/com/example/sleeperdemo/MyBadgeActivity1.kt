package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMyBadge1Binding
import com.example.sleeperdemo.databinding.ActivityMyPage3Binding

class MyBadgeActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityMyBadge1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBadge1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myBadgeClick1.setOnClickListener {
            val intent = Intent(this@MyBadgeActivity1, MyPageActivity4::class.java)
            startActivity(intent)
        }
    }
}