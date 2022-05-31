package com.example;

import java.sql.SQLException;

import com.example.controller.QuestaoController;

/**
 * JavaFX App
 */
public class App{
    public static void main(String[] args) throws SQLException {
        
        
        
        QuestaoController objControle = new QuestaoController();
      
        objControle.criarQuestao("tooo loooko",123131);
        objControle.criarQuestao("alalalalal",123131);
    }

}