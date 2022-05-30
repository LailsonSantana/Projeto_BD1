package com.example.controller;

import java.sql.SQLException;

import com.example.dao.AlunoDAO;
import com.example.model.Aluno;

public class AlunoController {

    public void cadastrarAluno(String nome,long matricula,String senha) throws SQLException{

        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.cadastrarAluno(new Aluno(nome, matricula, senha));

    }
    
}
