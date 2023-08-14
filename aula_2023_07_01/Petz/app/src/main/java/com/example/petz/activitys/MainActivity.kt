package com.example.petz.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.petz.R
import com.example.petz.adapter.ReciclerAdapter
import com.example.petz.dbo.DBconnect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Conexão com o banco
        val db = DBconnect(this)

        //Identificar a nossa lista
        val lista = findViewById<RecyclerView>(R.id.recyclerView)
        lista.adapter = ReciclerAdapter(this, db.ListarPets())

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener(){
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()


        //Conexão com o banco
        val db = DBconnect(this)

        //Identificar a nossa lista
        val lista = findViewById<RecyclerView>(R.id.recyclerView)
        lista.adapter = ReciclerAdapter(this, db.ListarPets())

    }
}