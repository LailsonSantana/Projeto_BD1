package com.example.controller;

import java.sql.SQLException;

import com.example.dao.ProfessorDAO;
import com.example.model.Professor;

public class ProfessorController {

    public void cadastrarProfessor(String nome,long matricula,String senha) throws SQLException{

        ProfessorDAO professorDAO = new ProfessorDAO();
        professorDAO.cadastrarProfessor(new Professor(nome,matricula,senha));
        System.out.println("CADASTRAR CHAMADO");
        
    }
    
}
