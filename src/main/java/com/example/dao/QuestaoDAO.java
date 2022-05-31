package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Questao;

public class QuestaoDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarQuestao(Questao q){

        String sql= "insert into questoes (enunciado,mat_professor) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setString(1,q.getEnunciado().toUpperCase());
            pst.setLong(2, q.getMat_prof());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }

    
    
}
