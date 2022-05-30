package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Turma;

public class TurmaDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarTurma(Turma t){

        String sql= "insert into turmas (nome,mat_professor) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setString(1,t.getNome().toUpperCase());
            pst.setLong(2, t.getMat_professor());
            pst.execute();

        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
