package com.example.model;

public class Acessa {

    private int cod_material;
    private long mat_aluno;

    public Acessa(int cm,long ma){
        cod_material = cm;
        mat_aluno = ma;
    }

    public int getCod_material() {
        return cod_material;
    }
    public void setCod_material(int cod_material) {
        this.cod_material = cod_material;
    }
    public long getMat_aluno() {
        return mat_aluno;
    }
    public void setMat_aluno(long mat_aluno) {
        this.mat_aluno = mat_aluno;
    }   
    
}
