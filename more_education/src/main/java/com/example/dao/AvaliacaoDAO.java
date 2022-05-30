package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Avaliacao;

public class AvaliacaoDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarAvaliacao(Avaliacao a){

        String sql= "insert into avaliacoes (num_questoes,mat_professor) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setInt(1, a.getNum_questoes());
            pst.setLong(2, a.getMat_professor());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
