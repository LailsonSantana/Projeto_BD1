package com.example.model;

public class Aluno {

    private long matricula;
    private String nome;
    private String senha;
    private byte acess;

    public Aluno(String n,long m , String s){
        nome = n;
        matricula = m;
        senha = s;
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
