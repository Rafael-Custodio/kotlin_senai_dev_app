package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  0 -> pedra, 1 -> papel, 2 -> tesoura
        var btn_papel = findViewById<ImageButton>(R.id.btn_papel)
        var btn_pedra = findViewById<ImageButton>(R.id.btn_pedra)
        var btn_tesoura = findViewById<ImageButton>(R.id.btn_tesoura)

        btn_pedra.setOnClickListener(){
            NossaJogada(0)
        }
        btn_papel.setOnClickListener(){
            NossaJogada(1)
        }
        btn_tesoura.setOnClickListener(){
            NossaJogada(2)
        }
    }

    fun JogadaMaquina() : Int
    {
        var imgMaquina = findViewById<ImageView>(R.id.imgMaquina)

        // numero randomico | 0 -> pedra, 1 -> papel, 2 -> tesoura
        var numeroRandomico = Random.nextInt(3);

        when( numeroRandomico )
        {
            0 -> imgMaquina.setImageDrawable( getDrawable(R.drawable.pedra) )
            1 -> imgMaquina.setImageDrawable( getDrawable(R.drawable.papel) )
            2 -> imgMaquina.setImageDrawable( getDrawable(R.drawable.tesoura) )
        }
        return numeroRandomico
    }

        fun NossaJogada ( jogada : Int ){

            //  0 -> pedra, 1 -> papel, 2 -> tesoura
            val jogadaMaquina = JogadaMaquina()
            var texto_resultado = findViewById<TextView>(R.id.txt_resultado)


            //Comparações
            // pedra > tesoura || papel > pedra || tesoura > papel
            if (jogada == 0 && jogadaMaquina == 2 || jogada == 1 && jogadaMaquina == 0 || jogada == 2 && jogadaMaquina == 1)
            {
                // Eu ganho
                Toast.makeText(this, "Ganhei", Toast.LENGTH_SHORT).show()


                texto_resultado.setTextColor(getResources().getColor(R.color.verde));
                texto_resultado.setText("VOCÊ VENCEU !!!\nPARABÉNS !!!\nUHUUUUUUUUUU");
            }
            else if (jogada == jogadaMaquina){
                //Empate
                Toast.makeText(this, "Empatei", Toast.LENGTH_SHORT).show()
                texto_resultado.setTextColor(getResources().getColor(R.color.amarelo));
                texto_resultado.setText("EMPATOU !!!");
            }
            else
            {
            //Eu perdi
                Toast.makeText(this, "Perdi", Toast.LENGTH_SHORT).show()
                texto_resultado.setTextColor(getResources().getColor(R.color.vermelho));
                texto_resultado.setText("VOCÊ PERDEU !!!\nHAHAHAHA" +
                        "\nBEM FEITO, RECEEEEEEEEBA\nPERDEDOR !!!\nLOOOOOOSER");
            }
        }



}