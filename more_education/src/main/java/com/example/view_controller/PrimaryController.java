package com.example.view_controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.controller.ProfessorController;
import com.example.dao.ConnectionFactory;
import com.example.model.Professor;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        
    }

    public void telaCriarTurma(ActionEvent event) throws IOException{
        String local = "../tela_dados_turma.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(local));
        CriaTurmaController turmaController = new CriaTurmaController();
        loader.setController(turmaController);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("CRIAR TURMA");
        stage.show();
    }

    public void conectar(ActionEvent event) throws SQLException{
        
        /*try{
            Connection conexao = new ConnectionFactory().getConnection();
            System.out.println("CONEXÃO ABERTA");
            //PreparedStatement pst = conexao.prepareStatement("SELECT * FROM cidade");
            //PreparedStatement pst = conexao.prepareStatement();
            //pst.execute();
            //ResultSet rs = pst.executeQuery();
            //while(rs.next()){
                //System.out.println(rs.getInt("id"));
            //}
        }catch(Exception e){
            
            e.printStackTrace();
        }*/
        ProfessorController pc = new ProfessorController();
        pc.cadastrarProfessor("ROGER", 6546, "SILVINHA123");

    }
    
}
