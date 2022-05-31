package com.example.model;

public class Professor {

    private long matricula;
    private String nome;
    private String senha;
    private byte acess = 1;

    /**
     * 
     * @param nome // nome do professor
     * @param matricula // matricula do professor
     * @param senha // senha do de acesso do professor
     */

    public Professor(String nome,long matricula, String senha){
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
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
