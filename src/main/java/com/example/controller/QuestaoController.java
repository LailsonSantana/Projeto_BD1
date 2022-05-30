package com.example.controller;

import java.sql.SQLException;

import com.example.dao.QuestaoDAO;
import com.example.model.Questao;

public class QuestaoController {

    public void criarQuestao(String enunciado,long matriculaP) throws SQLException{

        QuestaoDAO questaoDAO = new QuestaoDAO();
        questaoDAO.criarQuestao(new Questao(enunciado,matriculaP));
        
        
    }
    
}
