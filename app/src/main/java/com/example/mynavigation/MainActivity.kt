package com.example.mynavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.mynavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnNavMenu.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.opHome -> {
                    Navigation.findNavController(b.fragmentContainerView)
                        .navigate(R.id.initFragment)
                    true
                }
                R.id.opProfile -> {
                    Navigation.findNavController(b.fragmentContainerView)
                        .navigate(R.id.firstFragment)
                    true
                }
                R.id.opSettings -> {
                    Navigation.findNavController(b.fragmentContainerView)
                        .navigate(R.id.secondFragment)
                    true
                }
                else -> false
            }
        }
    }
}