package com.test.qolami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView4) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomnav)
        //navcontroler,nacdestination,bundle
        navController.addOnDestinationChangedListener { navcontroler, destination, bundle ->

            when (destination.id) {
                R.id.loginFragment, R.id.registerFragment,
                R.id.lupaPasswordFragment, R.id.onBoardingMangerFragment,
                R.id.splashScreenFragment, R.id.pelajaranHurufFragment -> {
                    bottomNavView.visibility = View.GONE
                }
                else -> {
                    bottomNavView.visibility = View.VISIBLE
                }
            }
        }
        NavigationUI.setupWithNavController(bottomNavView, navController)
        bottomNavView.setOnItemSelectedListener { menuItem ->
            // Menangani aksi saat item dipilih di sini

            true // Mengembalikan true menandakan bahwa aksi telah ditangani
        }

        bottomNavView.menu.getItem(0).isChecked = true
    }
    fun clearBackStackInclusive(tag: String?) {
        supportFragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

}