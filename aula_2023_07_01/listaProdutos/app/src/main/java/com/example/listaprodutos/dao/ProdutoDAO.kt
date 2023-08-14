package com.example.listaprodutos.dao

import com.example.listaprodutos.model.Produto

class ProdutoDAO {

    //Criando uma lista infinita de produtos
    private val produtos = mutableListOf<Produto>()

    //Função para listar produtos
    fun ListarProduto():List<Produto>
    {
        return produtos.toList()
    }

    //Função para adicionar produtos
    fun AdicionarProdutos(produto:Produto)
    {
        produtos.add(produto)
    }

    //Função para remover os elementos da Lista
    fun RemoverProduto()
    {

    }

}