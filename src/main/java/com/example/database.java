package com.example;

public class database {

    String admin;
    String senha;
    String URL;
    
    public database(){
        this.admin = "postgres";
        this.senha = "admin";
        this.URL = "jdbc:postgresql://localhost:5432/MoreEducation";
    }

    public String getAdmin() {
        return admin;
    }

    public String getSenha() {
        return senha;
    }
    public String getURL(){
        return URL;
    }


}
