package com.example.Compras.servise;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class S_Compras {
    private RestTemplate rt = new RestTemplate();

    public void getAPIdata(String data){
        String getAPIdata = rt.getForObject("http://localhost:8080/API/"+data, String.class);

    }
}
