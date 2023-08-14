package com.example.listaprodutos.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.dao.ProdutoDAO
import com.example.listaprodutos.model.Produto
import com.example.listaprodutos.ui.RecycleAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Trazer a nossa lista de Produtos
        val dao = ProdutoDAO()
        dao.AdicionarProdutos(Produto("Trakinas", "Bolacha de limão", BigDecimal("2.00")))
        dao.AdicionarProdutos(Produto("Passatempo", "Bolacha de leite", BigDecimal("1.00")))


        var listaProdutos = dao.ListarProduto()

        //Identificar a lista
        val listaView = findViewById<RecyclerView>(R.id.recyclerView)
        listaView.adapter = RecycleAdapter(this, listaProdutos)

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        listaView.adapter = RecycleAdapter(this, listaProdutos)
        fab.setOnClickListener()
        {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }

    }
}