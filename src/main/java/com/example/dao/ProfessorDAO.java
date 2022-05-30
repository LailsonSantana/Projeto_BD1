package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Professor;

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
    
}
