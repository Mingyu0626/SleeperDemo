package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMission1Binding
import com.example.sleeperdemo.databinding.ActivityMission2Binding

class MissionActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMission2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMission2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.missionClick2.setOnClickListener {
            val intent = Intent(this@MissionActivity2, MyPageActivity1::class.java)
            startActivity(intent)
        }
    }
}