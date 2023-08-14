package com.example.petz.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.petz.R
import com.example.petz.dbo.DBconnect

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val db = DBconnect(this)
        val btnCadastro = findViewById<Button>(R.id.btn_cadastrar)
        btnCadastro.setOnClickListener()
        {
            val nome = findViewById<EditText>(R.id.editNome).text.toString()
            val raca = findViewById<EditText>(R.id.editRaca).text.toString()
            val local = findViewById<EditText>(R.id.editLocalizacao).text.toString()
            val idade = findViewById<EditText>(R.id.editIdade).text.toString()
            val tipoIdade =
                VerificarIdade(idade.toInt(), findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId)

            db.AdicionarPet(nome, raca, local, idade.toInt(), tipoIdade)
            finish()
        }
    }

    fun VerificarIdade(idade: Int, radioButton: Int): String {
        if (radioButton == R.id.radioAnos) {
            if (idade > 1) {
                return "Anos"
            } else {
                return "Ano"
            }
        } else {
            if (idade > 1) {
                return "Meses"
            } else {
                return "Mês"
            }
        }
    }
}