package com.example.Compras.model;

import java.util.HashMap;
import java.util.Map;

public class M_RespostaAPI {
    private Map<String, M_Comprasjson> compras = new HashMap<>();

    public Map<String, M_Comprasjson> getRate(){
        return compras;
    }
}
