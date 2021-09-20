package br.com.unipac.conversorrealdolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValorInReal = findViewById<EditText>(R.id.edtValorInReal)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnConvert.setOnClickListener {

            val valorEmReaisedt = edtValorInReal.text.toString()

            if (valorEmReaisedt.trim().isNotEmpty()) {

                val valoremReais: Double = valorEmReaisedt.toDouble()

                val valorConvertido = valoremReais * 5.28

                val valorConvertidoFormatado: String = "%.2f".format(valorConvertido)

                tvResult.text = "R$: $valorConvertidoFormatado"

            } else {
                Toast.makeText(
                    this,
                    "É necessário inserir algum valor!",
                    Toast.LENGTH_SHORT
                ).show()

            }


        }


    }
}