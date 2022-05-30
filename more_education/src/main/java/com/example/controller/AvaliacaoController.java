package com.example.controller;

import java.sql.SQLException;

import com.example.dao.AvaliacaoDAO;
import com.example.model.Avaliacao;

public class AvaliacaoController {

    public void criarAvaliacao(int nq,long mat) throws SQLException{

        AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
        avaliacaoDAO.criarAvaliacao(new Avaliacao(nq,mat));
        System.out.println("CADASTRAR CHAMADO");
        
    }
    
}
