package com.example.appgorjetai

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val btnStart = findViewById<Button>(R.id.start)

        btnStart.setOnClickListener {
            val intent = Intent(this,Recebimento_Dados::class.java)
            intent.putExtra(KEY_NEXT_ACTIVITY,"Next.Activity")
            startActivity(intent)

        }
    }


}