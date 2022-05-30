package com.example.model;

public class Turma {

    private String nome;
    private int id;
    private long mat_professor;

    public Turma(String nome,long m){
        this.nome = nome;
        this.mat_professor = m;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public long getMat_professor() {
        return mat_professor;
    }

    public void setMat_professor(long mat_professor) {
        this.mat_professor = mat_professor;
    }

    
 
}
