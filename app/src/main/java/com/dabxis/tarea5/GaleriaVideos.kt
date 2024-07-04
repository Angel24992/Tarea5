package com.dabxis.tarea5

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dabxis.tarea5.databinding.ActivityGaleriaVideosBinding

class GaleriaVideos : AppCompatActivity() {
    private lateinit var binding: ActivityGaleriaVideosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGaleriaVideosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.boton4.setOnClickListener{seleccionarVideo()}
    }

    private fun seleccionarVideo() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="video/*"
        register2.launch(intent)
    }
    val register2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode== Activity.RESULT_OK){
            val intent = it.data
            binding.video.setVideoURI(intent?.data)
            binding.video.start()
        }
    }
}