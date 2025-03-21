package com.example.Compras.servise;


import com.example.Compras.model.M_Compra;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class S_Compras {
    private RestTemplate rt = new RestTemplate();

    public void getAPIData(String data) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String respostaAPI = rt.getForObject("http://localhost:8080/API/" + data, String.class);

        List<M_Compra> produtos = objectMapper.readValue(respostaAPI, objectMapper.getTypeFactory().constructCollectionType(List.class, M_Compra.class));

    }
}
