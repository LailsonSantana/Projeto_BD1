package com.example.controller;

import java.sql.SQLException;
import com.example.dao.QuestaoDAO;
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
    public void criarQuestao(String enun, long mat) throws SQLException{

        QuestaoDAO questaoDAO = new QuestaoDAO();
        questaoDAO.criarQuestao(new Questao(enun,mat));
        
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
