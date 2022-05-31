package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Material;

public class MaterialDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarMaterial(Material m){

        String sql= "insert into materais (tipo,mat_professor_m,conteudo) values (?,?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1,m.getTipo().toUpperCase());
            pst.setLong(2, m.getMat_professor());
            pst.setString(3, m.getConteudo());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }

    public void removerMaterial(int codMaterial){

        String sql = "DELETE FROM materais WHERE cod_material = ?";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1,codMaterial);

        }catch(Exception e){
            e.getMessage();
        }
    }
    
}
