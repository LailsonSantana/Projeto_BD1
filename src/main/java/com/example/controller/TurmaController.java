package com.example.controller;

import com.example.dao.TurmaDAO;
import com.example.model.Turma;

public class TurmaController {

    public void criarTurma(String nome,long m){

        TurmaDAO turmaDAO = new TurmaDAO();
        turmaDAO.criarTurma(new Turma(nome,m));
        
    }
    
}
