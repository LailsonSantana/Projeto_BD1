package com.example.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.dao.QuestaoDAO;
import com.example.model.Alternativa;
import com.example.model.Questao;

public class QuestaoController {

    /**
     * 
     * @param codigo //codigo da questao
     * @param enun // enunciado da questao
     * @param mat // matricula do professor
     * @param listAlternativas // lista de alternativas da questao
     * @param alternativaCorreta // a alternativa correta 
     * @throws SQLException
     */
    public void criarQuestao(int codigo, String enun, long mat, ArrayList<Alternativa> listAlternativas, int alternativaCorreta) throws SQLException{

        QuestaoDAO questaoDAO = new QuestaoDAO();
        questaoDAO.criarQuestao(new Questao(codigo,enun,mat,listAlternativas,alternativaCorreta));
        

        
    }

    /**
     * 
     * @param codigo codigo para fazer busca da questao
     */
    public void deletQuestao(int codigo){
        QuestaoDAO questaoDAO = new QuestaoDAO();

        questaoDAO.deleteQuestao(codigo);
    }
}
