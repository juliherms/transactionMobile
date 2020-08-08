package com.example.transactionmobile

import android.content.Context
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.transactionmobile.ui.component.ComponentViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private val componentViewModel: ComponentViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        //verify component and hide bottomNavigation
        componentViewModel._components.observe(this, Observer {
            it?.let { hasComponents ->
                if(hasComponents.bottomNavigation){
                    navView.visibility = View.VISIBLE
                } else {
                    navView.visibility = View.GONE
                }
            }
        })
    }
}