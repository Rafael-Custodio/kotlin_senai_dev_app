package com.example.exemplocruddbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Identificar a lista
        listView = findViewById(R.id.listaUsuarios)

        //Criando o banco
        val dbo = DBConnect(this)
        val listaUsuario = dbo.ListarUsuarios()

        ListarUsuario(listaUsuario)
    }

    //Ler e exibir a lista
    fun ListarUsuario(listaDeUsuarios: ArrayList<Usuario>)
    {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeUsuarios)
        listView.adapter = adapter
    }
}