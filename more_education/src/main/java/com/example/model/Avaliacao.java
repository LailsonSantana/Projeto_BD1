package com.example.model;

public class Avaliacao {

    private int codigo;
    private int num_questoes;
    private long mat_professor;

    public Avaliacao(int nq,long mat){
        
        num_questoes = nq;
        mat_professor = mat;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getNum_questoes() {
        return num_questoes;
    }
    public void setNum_questoes(int num_questoes) {
        this.num_questoes = num_questoes;
    }
    public long getMat_professor() {
        return mat_professor;
    }
    public void setMat_professor(long mat_professor) {
        this.mat_professor = mat_professor;
    }

}
