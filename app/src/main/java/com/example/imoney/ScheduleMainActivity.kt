package com.example.imoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class ScheduleMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule_main)
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
//        navController = navHostFragment.navController
    }
}