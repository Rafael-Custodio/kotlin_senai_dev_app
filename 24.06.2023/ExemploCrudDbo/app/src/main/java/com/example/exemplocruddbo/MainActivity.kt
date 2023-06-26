package com.example.exemplocruddbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
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
        ListarUsuario(dbo.ListarUsuarios())

        //Click dos itens da lista
        val lista = findViewById<ListView>(R.id.listaUsuarios)
        lista.setOnItemClickListener{_, _, position, _ ->
            val lista = dbo.ListarUsuarios()
           findViewById<>()
            findViewById<EditText>(R.id.nome).setText("${lista[position].nome}")
            findViewById<EditText>(R.id.email).setText("${lista[position].email}")

        }

        val btn_inserir = findViewById<Button>(R.id.btn_cadastrar)
        btn_inserir.setOnClickListener()
        {
            val nomeUsuario = findViewById<EditText>(R.id.nome).text.toString()
            val emailUsuario = findViewById<EditText>(R.id.email).text.toString()

            //Mandar as informações pro banco
            dbo.InserirUsuario(nomeUsuario, emailUsuario)
            ListarUsuario(dbo.ListarUsuarios())
        }
        val btn_remover = findViewById<Button>(R.id.btn_remover)
    }

    //Ler e exibir a lista
    fun ListarUsuario(listaDeUsuarios: ArrayList<Usuario>)
    {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeUsuarios)
        listView.adapter = adapter
    }
}