package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Acessa;

public class AcessaDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarAcesso(Acessa a){

        String sql= "insert into acessos (cod_material_a,mat_aluno) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, a.getCod_material());
            pst.setLong(2, a.getMat_aluno());
            
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
