package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Alternativa;


public class AlternativaDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarAlternativa(Alternativa a){

        String sql= "insert into alternativas (letra,resposta,eh_correta,cod_questao) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setString(1, String.valueOf(a.getLetra()));
            pst.setString(2, a.getResposta());
            pst.setBoolean(3, a.isEh_correta());
            pst.setInt(4, a.getCod_questao());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
