package com.example.controller;

import com.example.dao.AcessaDAO;
import com.example.model.Acessa;

public class AcessaController {

    public void cadastrarAcesso(int cm,long ma){
        AcessaDAO acessaDAO = new AcessaDAO();
        acessaDAO.criarAcesso(new Acessa(cm, ma));
    }
    
}
