package com.example.trabalho_de_mobile.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trabalho_de_mobile.MainActivity
import com.example.trabalho_de_mobile.R
import com.example.trabalho_de_mobile.databinding.ActivityCardapioBinding

class CardapioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardapioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cardapio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityCardapioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logout.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.pedido.setOnClickListener{
            val intent = Intent(this, PedidosActivity::class.java)
            startActivity(intent)
        }


        binding.chocolate.setOnClickListener{
            val intent = Intent(this,ChocolateActivity::class.java)
            startActivity(intent)
        }

        binding.chocolateBranco.setOnClickListener{
            val intent = Intent(this,ChocolateBrancoActivity::class.java)
            startActivity(intent)
        }

        binding.ninho.setOnClickListener{
            val intent = Intent(this,NinhoActivity::class.java)
            startActivity(intent)
        }

        binding.nutella.setOnClickListener{
            val intent = Intent(this,NutellaActivity::class.java)
            startActivity(intent)
        }

        binding.pistache.setOnClickListener{
            val intent = Intent(this,PistacheActivity::class.java)
            startActivity(intent)
        }

        binding.carolina.setOnClickListener{
            val intent = Intent(this,CarolinasActivity::class.java)
            startActivity(intent)
        }

        binding.forrobodo.setOnClickListener{
            val intent = Intent(this,ForrobodosActivity::class.java)
            startActivity(intent)
        }

        binding.sonho.setOnClickListener{
            val intent = Intent(this,SonhosActivity::class.java)
            startActivity(intent)
        }

        binding.tortadelimao.setOnClickListener{
            val intent = Intent(this,TortadelimaosActivity::class.java)
            startActivity(intent)
        }

        binding.suspiro.setOnClickListener{
            val intent = Intent(this,SuspirosActivity::class.java)
            startActivity(intent)
        }

        binding.sucodelaranja.setOnClickListener{
            val intent = Intent(this,SucoDeLaranjaActivity::class.java)
            startActivity(intent)
        }

        binding.sucodemorango.setOnClickListener{
            val intent = Intent(this,SucoDeMorangoActivity::class.java)
            startActivity(intent)
        }

        binding.sucodeabacaxi.setOnClickListener{
            val intent = Intent(this,SucoDeAbacaxiActivity::class.java)
            startActivity(intent)
        }

        binding.sucodeacerola.setOnClickListener{
            val intent = Intent(this,SucoDeAcerolaActivity::class.java)
            startActivity(intent)
        }

        binding.sucodemelancia.setOnClickListener{
            val intent = Intent(this,SucoDeMelanciaActivity::class.java)
            startActivity(intent)
        }



    }
}