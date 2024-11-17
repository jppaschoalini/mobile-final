package com.example.trabalho_de_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.controller.AutenticacaoControlller
import com.example.trabalho_de_mobile.databinding.ActivityMainBinding
import com.example.trabalho_de_mobile.view.CadastrarActivity
import com.example.trabalho_de_mobile.view.CardapioActivity
import com.example.trabalho_de_mobile.view.EsqueceuSenhaActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ctrl: AutenticacaoControlller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val email = binding.txtEmail.text.toString();
            val senha = binding.txtSenha.text.toString();
            ctrl = AutenticacaoControlller()
            ctrl.login(email, senha) { sucesso, erro ->
                if (sucesso) {
                    val intent = Intent(this, CardapioActivity::class.java)
                    startActivity(intent)
                } else {
                    println("Erro no login: $erro")
                }
            }

        }

        binding.txtCadastrar.setOnClickListener {
            val intent = Intent(this, CadastrarActivity::class.java)
            startActivity(intent)
        }

        binding.txtEsqueceuSenha.setOnClickListener {
            val intent = Intent(this, EsqueceuSenhaActivity::class.java)
            startActivity(intent)
        }
    }
}
