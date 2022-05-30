package com.example.controller;

import com.example.dao.EhCompostaDAO;
import com.example.model.Eh_Composta;

public class EhCompostaController {

    public void criarComposicao(int cq,int ca){

        EhCompostaDAO ehCompostaDAO = new EhCompostaDAO();
        ehCompostaDAO.criarComposicao(new Eh_Composta(cq, ca));
        
    }
    
}
