package com.example.Compras.controller;

import com.example.Compras.servise.S_Compras;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Compras {
    private final S_Compras s_compras;


    public C_Compras(S_Compras s_compras) {
        this.s_compras = s_compras;
    }
    @GetMapping("/")
    public String index(){
        s_compras.getAPIdata("2025-03-18");
        return "index";
    }
}
