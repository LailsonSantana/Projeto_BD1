package com.example.controller;

import java.sql.SQLException;

import com.example.dao.AlternativaDAO;
import com.example.model.Alternativa;

public class AlternativaController {

    public void criarAlternativa(char l,String r,int cq) throws SQLException{

        AlternativaDAO alternativaDAO = new AlternativaDAO();
        alternativaDAO.criarAlternativa(new Alternativa(l, r, cq));
        System.out.println("CADASTRAR CHAMADO");
        
    }
    
}
