package com.example.trabalho_de_mobile.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.R
import com.example.trabalho_de_mobile.controller.AutenticacaoControlller
import com.example.trabalho_de_mobile.databinding.ActivityCadastrarBinding

class CadastrarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastrarBinding
    private lateinit var ctrl : AutenticacaoControlller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastrar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityCadastrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalvar.setOnClickListener {
            val email = binding.txtEmail.text.toString()
            val senha = binding.txtSenha.text.toString()
            ctrl = AutenticacaoControlller()
            ctrl.criarUsuario(email, senha) { sucesso, erro ->
                if (sucesso) {
                    Toast.makeText(this, "Usuário criado com sucesso",
                        Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(this, "Erro ao criar usuário: " +
                            erro.toString(), Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
