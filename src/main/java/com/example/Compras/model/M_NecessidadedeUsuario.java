package com.example.Compras.model;

import java.util.List;

public class M_NecessidadedeUsuario {
   private M_Usuario usuario;
   private List<M_Compra> produtos;

    public M_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(M_Usuario usuario) {
        this.usuario = usuario;
    }

    public List<M_Compra> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<M_Compra> produtos) {
        this.produtos = produtos;
    }
    public void addProduto(M_Compra produto){
        this.produtos.add(produto);
    }
}
