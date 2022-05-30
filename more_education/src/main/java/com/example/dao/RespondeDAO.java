package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.Responde;

public class RespondeDAO {

    private PreparedStatement pst;
    private Connection conexao;

    public void criarResposta(Responde r){

        String sql= "insert into respostas (num_acertos,num_erros,mat_aluno_r,cod_avaliacao_r) values (?,?)";

        try{
            conexao = new ConnectionFactory ().getConnection();
            pst = conexao.prepareStatement(sql);
            //toUpperCase() converte a string para maiúsculo
            pst.setInt(1, r.getNum_acertos());
            pst.setInt(2, r.getNum_erros());
            pst.setLong(3, r.getMat_aluno());
            pst.setInt(4, r.getCod_avaliacao());
            pst.execute();
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
}
