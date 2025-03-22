package com.example.appgorjetai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.appgorjetai.databinding.ActivitySumaryBinding


class Sumary : AppCompatActivity() {
    private lateinit var binding: ActivitySumaryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySumaryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)

        val totalOfPeople = intent.getFloatExtra("totalOfPeople",0.0f)
        val percentage = intent.getIntExtra("percentage",0)
        val totalTable = intent.getFloatExtra("totalTable",0.0f)
        val nPeople = intent.getIntExtra("nPeople",0)

        binding.tvConta.setText("R$" + totalTable.toString())
        binding.tvNumberpeople.setText(nPeople.toString())
        binding.tvPercentage.setText(percentage.toString() + "%")
        binding.tvTotalOfPeople.setText(totalOfPeople.toString())


        binding.btnRefresh.setOnClickListener {
            finish()
        }
    }
}