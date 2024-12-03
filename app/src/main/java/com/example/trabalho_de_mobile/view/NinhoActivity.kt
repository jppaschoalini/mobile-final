package com.example.trabalho_de_mobile.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.R
import com.example.trabalho_de_mobile.databinding.ActivityChocolateBinding
import com.example.trabalho_de_mobile.databinding.ActivityChocolateBrancoBinding
import com.example.trabalho_de_mobile.databinding.ActivityNinhoBinding

class NinhoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNinhoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ninho)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityNinhoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener {
            val intent = Intent(this, CardapioActivity::class.java)
            startActivity(intent)
        }

        binding.additen.setOnClickListener{
            Toast.makeText(this, "item adicionado", Toast.LENGTH_LONG).show()
        }
    }
}