package com.example.imoney.manager

import android.content.Context
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentNavigation(val bottomNavigation : BottomNavigationView, val context : Context){
    val bottomNav : BottomNavigationView by lazy { bottomNavigation }
}