package com.example.Compras.servise;

import com.example.Compras.model.M_Usuario;
import com.example.Compras.repository.R_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class S_Cadastro {
    @Autowired
    private R_Usuario r_usuario;

    public S_Cadastro(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }

    public M_Usuario cadastrarUsuario(String Nome,
                                      String URL) {
        boolean podeSalvar = true;

        if (Nome.trim().equals("") || Nome == null) {
            podeSalvar = false;
        }
        if (URL.trim().equals("") || URL == null) {
            podeSalvar = false;
        }

        if (podeSalvar) {
            M_Usuario m_usuario = new M_Usuario();
             m_usuario.setNome(Nome);
            m_usuario.setURL(URL);
            return r_usuario.save(m_usuario);
        }
        return null;
   }
}
