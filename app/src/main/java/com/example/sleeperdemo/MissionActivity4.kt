package com.example.sleeperdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sleeperdemo.databinding.ActivityMain2Binding
import com.example.sleeperdemo.databinding.ActivityMission4Binding

class MissionActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMission4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMission4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.missionClick4.setOnClickListener {
            val intent = Intent(this@MissionActivity4, MyPageActivity3
            ::class.java)
            startActivity(intent)
        }
    }
}