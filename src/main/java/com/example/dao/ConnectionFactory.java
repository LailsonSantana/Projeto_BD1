package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import com.example.database;

public class ConnectionFactory {

    static database objBase = new database();

    //Usuário do banco de dados postgres
    private static final String USERNAME = objBase.getAdmin();

    //Senha do banco de dados postgres
    private static final String PASSWORD = objBase.getSenha();

    //Caminho do BD
    private static final String DB_URL = objBase.getURL();
    // Conexão com o BD postgres
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
         DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        
        return conexao;
    }
}