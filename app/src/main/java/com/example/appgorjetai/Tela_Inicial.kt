package com.example.appgorjetai

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjetai.databinding.ActivityTelaInicialBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Recebimento_Dados::class.java)
            startActivity(intent)
        }, 2000)
    }
}