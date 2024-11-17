package com.example.trabalho_de_mobile.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.R
import com.example.trabalho_de_mobile.controller.AutenticacaoControlller
import com.example.trabalho_de_mobile.databinding.ActivityEsqueceuSenhaBinding

class EsqueceuSenhaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEsqueceuSenhaBinding
    private lateinit var ctrl : AutenticacaoControlller

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_esqueceu_senha)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityEsqueceuSenhaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val email = binding.txtEmail.text.toString()

            ctrl = AutenticacaoControlller()
            ctrl.esqueceuSenha(email) { sucesso, erro ->
                if (sucesso) {
                    Toast.makeText(this,"Um e-mail de redefinição de senha foi enviado para " +
                            "o seu endereço de e-mail.",
                        Toast.LENGTH_LONG).show()
                    finish()

                } else {
                    Toast.makeText(this,
                        "Falha ao enviar e-mail de redefinição de senha. " +
                                "Verifique se o endereço de e-mail é válido.",
                        Toast.LENGTH_LONG).show()
                }
            }

        }

    }
}
