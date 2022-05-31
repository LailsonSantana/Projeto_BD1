package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Aluno;

import javafx.event.ActionEvent;

public class AlunoDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void cadastrarAluno(Aluno a) throws SQLException{

        String sql= "insert into alunos (nome,matricula,senha) values (?,?,?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setString(1,a.getNome().toUpperCase());
            pst.setLong(2, a.getMatricula());
            pst.setString(3,a.getSenha());
            pst.setByte(4, a.getLevel());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }finally {
            if (pst != null)
                pst.close();
            if (conexao != null)
                conexao.close();
        }
    }

    
    public void fazerLogin(long matricula,String senha){

        try{
            String sql = "SELECT FROM matricula WHERE matricula = ?";
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            pst.setLong(1, matricula);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getLong(1));
            }
        }catch(Exception e){

        }

    }
    
}
