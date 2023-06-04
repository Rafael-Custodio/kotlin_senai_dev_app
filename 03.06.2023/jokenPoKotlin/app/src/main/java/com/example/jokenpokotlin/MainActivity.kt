package com.example.jokenpokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        var imgMaquina = findViewById<ImageView>(R.id.imgMaquina)

        btn.setOnClickListener(){
            //número randômico || 0 -> Pedra, 1 -> Papel, 2 -> Tesoura
            var numeroRandomico = Random.nextInt(3)

            when(numeroRandomico){
                0 -> imgMaquina.setImageDrawable(getDrawable(R.drawable.pedra))
                1 -> imgMaquina.setImageDrawable(getDrawable(R.drawable.papel))
                2 -> imgMaquina.setImageDrawable(getDrawable(R.drawable.tesoura))
            }
        }
    }
}