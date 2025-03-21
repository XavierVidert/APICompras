package com.example.Compras.model;


import jakarta.persistence.*;

@Entity
@Table(name ="compra")
public class M_Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String min;
    private String max;
    private String produto;
    private String quantidade;
    private String custo_medio;
    private String ltima_compra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCusto_medio() {
        return custo_medio;
    }

    public void setCusto_medio(String custo_medio) {
        this.custo_medio = custo_medio;
    }

    public String getLtima_compra() {
        return ltima_compra;
    }

    public void setLtima_compra(String ltima_compra) {
        this.ltima_compra = ltima_compra;
    }
}
