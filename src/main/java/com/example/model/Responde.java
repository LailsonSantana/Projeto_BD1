package com.example.model;

public class Responde {

    private int num_acertos;
    private int num_erros;
    private long mat_aluno;
    private int cod_avaliacao;

    public Responde(int na,int ne,long m,int ca){
        num_acertos = na;
        num_erros = ne;
        mat_aluno = m;
        ca = cod_avaliacao;
    }

    public int getNum_acertos() {
        return num_acertos;
    }

    public void setNum_acertos(int num_acertos) {
        this.num_acertos = num_acertos;
    }

    public int getNum_erros() {
        return num_erros;
    }

    public void setNum_erros(int num_erros) {
        this.num_erros = num_erros;
    }

    public long getMat_aluno() {
        return mat_aluno;
    }

    public void setMat_aluno(long mat_aluno) {
        this.mat_aluno = mat_aluno;
    }

    public int getCod_avaliacao() {
        return cod_avaliacao;
    }

    public void setCod_avaliacao(int cod_avaliacao) {
        this.cod_avaliacao = cod_avaliacao;
    }


}
    

