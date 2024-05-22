package com.test.qolami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController
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
                R.id.homeFragment, R.id.pelajaranFragment, R.id.fragmentLatihan ->  {
                    bottomNavView.visibility = View.VISIBLE
                }
                else -> {
                    bottomNavView.visibility = View.GONE
                }
            }
        }
        NavigationUI.setupWithNavController(bottomNavView, navController)
        bottomNavView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home ->{
                    navController.navigate(R.id.homeFragment)
                    true
                }
                R.id.pelajaran ->{
                    navController.navigate(R.id.pelajaranFragment)
                    true
                }
                R.id.latihan -> {
                    navController.navigate(R.id.fragmentLatihan)
                    true
                }
                else -> false
            }

            true // Mengembalikan true menandakan bahwa aksi telah ditangani
        }

        bottomNavView.menu.getItem(0).isChecked = true
    }
    fun clearBackStackInclusive(tag: String?) {
        supportFragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

}