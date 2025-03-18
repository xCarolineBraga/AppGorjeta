package com.example.appgorjetai

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_NEXT_ACTIVITY ="Next.Activity"

class Recebimento_Dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recebimento_dados)

        // Valor total conta
        // número de pessoas
        // porcentagem gorjeta
        // 10% , 15% ou 20%
        // Botão p Calcular
        // Limpar

        // Recuperar as views do layout
        // FindViewById
        //ViewBinding

        val inicio = intent.getStringExtra(KEY_NEXT_ACTIVITY)

        val edtTotal = findViewById<TextInputEditText>(R.id.tie_total)
        val edtNumPeople = findViewById<TextInputEditText>(R.id.tie_num_people)
        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnDone = findViewById<Button>(R.id.btn_done)

        btnClean.setOnClickListener {
            println("ação 1" + edtTotal.text)
            println("ação 2" + edtNumPeople.text)

        }

    }

}