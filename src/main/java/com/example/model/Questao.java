package com.example.model;

import java.util.ArrayList;

import com.example.dao.ConnectionFactory;

public class Questao {

    private int codigo;
    private String enunciado;
    private long mat_prof;
    private ArrayList<Alternativa> listAlternativas;
    private Alternativa alternativaCorreta;

    /**
     * 
     * @param codigo // codigo autoincrement da questao
     * @param enun // enunciado da questao
     * @param mat //matricula do professor
     * @param listAlternativas // alternativas que a questao posssui
     * @param alternativaCorreta // a alternativa correta da questao
     */

    public Questao(int codigo, String enun, long mat, ArrayList<Alternativa> listAlternativas, int alternativaCorreta){
        this.enunciado   = enun;
        this.mat_prof    = mat;
        this.listAlternativas = listAlternativas;
        this.alternativaCorreta = listAlternativas.get(alternativaCorreta);
    }


    public ArrayList<Alternativa> getListAlternativas() {
        return listAlternativas;
    }

    public void setListAlternativas(ArrayList<Alternativa> listAlternativas) {
        this.listAlternativas = listAlternativas;
    }

    public Alternativa getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(Alternativa alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
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
