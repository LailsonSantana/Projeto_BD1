package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.controller.ProfessorController;
import com.example.controller.QuestaoController;
import com.example.model.Alternativa;
import com.example.view_controller.PrimaryController;



/**
 * JavaFX App
 */
public class App{
    public static void main(String[] args) throws SQLException {
        
        
        
        QuestaoController objControle = new QuestaoController();
        Alternativa tuturuu = new Alternativa('c', "alalalalalalla", 2);
        ArrayList<Alternativa> listVazio = new ArrayList<>();
        listVazio.add(tuturuu);
        
        objControle.deletQuestao(3);
    }

}