package com.example.Compras.controller;

import com.example.Compras.model.M_Usuario;
import com.example.Compras.servise.S_Cadastro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

@Controller
public class C_Cadastro{
    private final S_Cadastro s_cadastro;

    public C_Cadastro(S_Cadastro s_cadastro) {
        this.s_cadastro = s_cadastro;
    }

    @GetMapping("/cadastro")
    public String getCadastro(){
        return "cadastro/cadastro";
    }

    @PostMapping("/cadastro")
    public String postCadastro(@RequestParam("Nome") String nome,
                               @RequestParam("URL") String url) {
        M_Usuario m_usuario = s_cadastro.cadastrarUsuario(nome,url);
        if(m_usuario != null){
            return "index";
        }
        return "cadastro/cadastro";
    }
}