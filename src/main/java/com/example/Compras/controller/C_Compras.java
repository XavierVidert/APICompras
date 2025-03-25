package com.example.Compras.controller;

import com.example.Compras.model.M_NecessidadedeUsuario;
import com.example.Compras.servise.S_Compras;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class C_Compras {
    private final S_Compras s_compras;


    public C_Compras(S_Compras s_compras) {
        this.s_compras = s_compras;
    }
    @GetMapping("/")
    public String index() throws Exception{
        s_compras.getAPIData("2025-03-21");

        return "index";
    }
    @PostMapping("/")
    public String index (@RequestParam( "data") String data, Model model)throws Exception {
        List<M_NecessidadedeUsuario> teste = s_compras.getNecessidadedeCompras(data);
        model.addAttribute("hoteis",s_compras.getNecessidadedeCompras(data));
        return "pv/partial_hotel";
    }
}
