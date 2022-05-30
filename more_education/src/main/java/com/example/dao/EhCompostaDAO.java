package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Eh_Composta;

public class EhCompostaDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarComposicao(Eh_Composta ec){

        String sql= "insert into composicoes (cod_questao_c,cod_avaliacao_c) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            
            pst.setInt(1, ec.getCod_questao());
            pst.setInt(2, ec.getCod_avaliacao());
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
