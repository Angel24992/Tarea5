package com.dabxis.tarea5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.tarea5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var id = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton1.setOnClickListener{irNewActivity1()
        }
        binding.boton2.setOnClickListener{irNewActivity2()
        }

    }

    private fun irNewActivity2() {
        val intent = Intent(this,GaleriaVideos::class.java)
        startActivity(intent)
    }

    private fun irNewActivity1() {
        val intent = Intent(this,GaleriaFotos::class.java)
        startActivity(intent)
    }
}