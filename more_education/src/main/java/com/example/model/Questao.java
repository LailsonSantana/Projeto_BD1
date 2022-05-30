package com.example.model;

public class Questao {

    private int codigo;
    private String enunciado;
    private long mat_prof;

    public Questao(String enun,long mat){
        enunciado = enun;
        mat_prof = mat;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public long getMat_prof() {
        return mat_prof;
    }
    public void setMat_prof(long mat_prof) {
        this.mat_prof = mat_prof;
    }

   
}
