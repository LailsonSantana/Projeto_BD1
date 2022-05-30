package com.example.model;

public class Professor {

    private long matricula;
    private String nome;
    private String senha;
    private byte acess = 1;

    public Professor(String n,long m, String s){
        this.nome = n;
        this.matricula = m;
        this.senha = s;

    }

    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public byte getLevel() {
        return acess;
    }
    public void setLevel(byte a) {
        this.acess = a;
    }
 
}
