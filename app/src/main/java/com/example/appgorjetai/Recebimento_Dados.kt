package com.example.appgorjetai

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appgorjetai.databinding.ActivityRecebimentoDadosBinding
import com.google.android.material.textfield.TextInputEditText

const val KEY_NEXT_ACTIVITY ="Next.Activity"

class Recebimento_Dados : AppCompatActivity() {
    private lateinit var binding : ActivityRecebimentoDadosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecebimentoDadosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.rbOptionOne.setOnCheckedChangeListener { buttonView, isChecked ->
            println("option One $isChecked")
        }
        binding.rbOptionTwo.setOnCheckedChangeListener { buttonView, isChecked ->
            println("option two $isChecked")
        }
        binding.rbOptionThree.setOnCheckedChangeListener { buttonView, isChecked ->
            println("option three $isChecked")
        }

        binding.btnClean.setOnClickListener {
            println("Carol 1" + binding.tieTotal.text)
            println("Carol 2 " + binding.tieNumPeople.text)
        }

        binding.btnDone.setOnClickListener {  }


        val inicio   = intent.getStringExtra(KEY_NEXT_ACTIVITY)







    }

}

// Valor total conta
// número de pessoas
// porcentagem gorjeta
// 10% , 15% ou 20%
// Botão p Calcular
// Limpar

// Recuperar as views do layout
// FindViewById
//ViewBinding