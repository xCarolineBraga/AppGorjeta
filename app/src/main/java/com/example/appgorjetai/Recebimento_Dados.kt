package com.example.appgorjetai

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appgorjetai.databinding.ActivityRecebimentoDadosBinding
import com.google.android.material.snackbar.Snackbar


class Recebimento_Dados : AppCompatActivity() {
    private lateinit var binding: ActivityRecebimentoDadosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecebimentoDadosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var percentage = 0

        binding.rbOptionOne.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                percentage = 10
            }
        }

        binding.rbOptionTwo.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                percentage = 15
            }
        }

        binding.rbOptionThree.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                percentage = 20
            }
        }

        binding.btnDone.setOnClickListener {

            val totalaccount = binding.tieTotal.text.toString()
            val numPeople = binding.tieNumPeople.text.toString()

            if (totalaccount == "" || numPeople == "") {

                Snackbar.make(
                    binding.tieTotal,
                    "Preencha todos os campos.",
                    Snackbar.LENGTH_LONG
                ).show()

            } else {
                val totalTable = totalaccount.toFloat()
                val nPeople = numPeople.toInt()


                val total = totalTable / nPeople
                val totalOfPeople = (total * percentage / 100) + total


                val intent = Intent(this,Sumary::class.java)
                intent.apply {
                    putExtra("totalOfPeople",totalOfPeople)
                    putExtra("percentage",percentage)
                    putExtra("totalTable",totalTable)
                    putExtra("nPeople",nPeople)
                }
                startActivity(intent)
            }
        }

        binding.btnClean.setOnClickListener {
            binding.tieTotal.setText("")
            binding.tieNumPeople.setText("")
            binding.rbOptionOne.isChecked = false
            binding.rbOptionTwo.isChecked = false
            binding.rbOptionThree.isChecked = false
        }

    }
}

