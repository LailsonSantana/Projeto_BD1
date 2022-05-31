package com.example.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Professor;

import javafx.event.ActionEvent;

public class ProfessorDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void cadastrarProfessor(Professor p) throws SQLException{

        String sql= "insert into professores (nome,matricula,senha,acess) values (?,?,?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setString(1,p.getNome().toUpperCase());
            pst.setLong(2, p.getMatricula());
            pst.setString(3,p.getSenha());
            pst.setByte(4, p.getLevel());
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
            String sql = "SELECT senha FROM professores WHERE matricula = " + matricula;
           
            
            conexao = new ConnectionFactory().getConnection();
            java.sql.Statement s = conexao.createStatement();
            
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                if(rs.getString("senha").equals(senha)){
                    System.out.println("LOGIN APROVADO");
                }
                else{
                    System.out.println("SENHA INCORRETA");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
