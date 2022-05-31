package com.example.model;


public class Questao {

    private String enunciado;
    private long mat_prof;

    /**
     * 
     * @param codigo // codigo autoincrement da questao
     * @param enun // enunciado da questao
     * @param mat //matricula do professor
     */

    public Questao(String enun, long mat){
        this.enunciado   = enun;
        this.mat_prof    = mat;
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
