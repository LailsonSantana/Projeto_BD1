package com.example.controller;

import java.sql.SQLException;

import com.example.dao.AlternativaDAO;
import com.example.model.Alternativa;

public class AlternativaController {

    /**
     * 
     * @param l letra que identifica a alternativa
     * @param r resposta da alternativa
     * @param c alternativa correta ou nao
     * @param cq condigo da questao
     */
    public void criarAlternativa(char l,String r,boolean c, int cq) throws SQLException{

        AlternativaDAO alternativaDAO = new AlternativaDAO();
        alternativaDAO.criarAlternativa(new Alternativa(l, r, c, cq));
        System.out.println("CADASTRAR CHAMADO");
        
    }
    
}
