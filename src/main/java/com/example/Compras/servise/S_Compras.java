package com.example.Compras.servise;


import com.example.Compras.model.M_Compra;
import com.example.Compras.model.M_NecessidadedeUsuario;
import com.example.Compras.model.M_Usuario;
import com.example.Compras.repository.R_Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

import java.util.List;

@Service
public class S_Compras {
    private RestTemplate rt = new RestTemplate();
    @Autowired
    private R_Usuario r_usuario;

    public List<M_Compra> getAPIData(String url) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String respostaAPI = rt.getForObject(url, String.class);
            List<M_Compra> produtos = objectMapper.readValue(respostaAPI, objectMapper.getTypeFactory().constructCollectionType(List.class, M_Compra.class));
            return produtos;
        } catch (Exception e) {
            return null;
        }
    }

    public List<M_NecessidadedeUsuario> getNecessidadedeCompras(String data) throws Exception {
        List<M_Usuario> usuarios = r_usuario.findAll();
        List<M_NecessidadedeUsuario> retorno = new ArrayList<>();

        for (M_Usuario usuario : usuarios) {
            M_NecessidadedeUsuario m_necessidadedeUsuario = new M_NecessidadedeUsuario();
            m_necessidadedeUsuario.setUsuario(usuario);
            m_necessidadedeUsuario.setProdutos(new ArrayList<>());

            List<M_Compra> produtos = getAPIData(usuario.getURL() + data);
            if (produtos != null) {
                for (M_Compra produto : produtos) {
                    m_necessidadedeUsuario.addProduto(produto);
                }
                retorno.add(m_necessidadedeUsuario);
            }
        }
        return retorno;
    }
}


