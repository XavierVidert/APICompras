package com.example.Compras.model;

import jakarta.persistence.*;

@Entity
@Table(
        name="hoteis",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = {"usuario"})
        })
public class M_Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;
    private String URL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}