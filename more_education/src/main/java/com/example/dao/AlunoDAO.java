package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Aluno;

public class AlunoDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void cadastrarAluno(Aluno a) throws SQLException{

        String sql= "insert into alunos (nome,matricula,senha,acess) values (?,?,?,?)";

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
    
}
