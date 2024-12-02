package com.example.trabalho_de_mobile.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.R
import com.example.trabalho_de_mobile.databinding.ActivityChocolateBinding
import com.example.trabalho_de_mobile.databinding.ActivityChocolateBrancoBinding
import com.example.trabalho_de_mobile.databinding.ActivityNutellaBinding

class NutellaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNutellaBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nutella)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityNutellaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener {
            val intent = Intent(this, CardapioActivity::class.java)
            startActivity(intent)
        }
    }
}