package com.dabxis.tarea5

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.tarea5.databinding.ActivityGaleriaFotosBinding

class GaleriaFotos : AppCompatActivity() {
    private lateinit var binding: ActivityGaleriaFotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGaleriaFotosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton3.setOnClickListener{seleccionarImagen()}

    }

    private fun seleccionarImagen() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="image/*"
        register1.launch(intent)
    }
    val register1= registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode== Activity.RESULT_OK){
            val intent = it.data
            binding.imagen.setImageURI(intent?.data)
        }
    }
}