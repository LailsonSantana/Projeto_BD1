package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Material;

public class MaterialDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarMaterial(Material m){

        String sql= "insert into materais (tipo,mat_professor_m) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1,m.getTipo().toUpperCase());
            pst.setLong(2, m.getMat_professor());
            pst.execute();
            
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
