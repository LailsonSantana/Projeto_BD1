package com.example.view_controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.controller.TurmaController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CriaTurmaController implements Initializable{

    @FXML TextField txtNomeTurma;
    @FXML Button btnSalvar;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        
    }

    public void salvarTurma(ActionEvent event){

        TurmaController turmaController = new TurmaController();
        String nome = txtNomeTurma.getText();
        turmaController.criarTurma(nome,657);// substituir pelo id de login 
        System.out.println(nome);
        Stage stage =  (Stage) btnSalvar.getScene().getWindow();
        stage.close();

    }
    
}
