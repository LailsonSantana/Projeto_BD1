package com.example.model;

public class Eh_Composta {

    private int cod_questao;
    private int cod_avaliacao;

    public Eh_Composta(int cq,int ca){
        cod_questao = cq;
        cod_avaliacao = ca;
    }

    public int getCod_questao() {
        return cod_questao;
    }

    public void setCod_questao(int cod_questao) {
        this.cod_questao = cod_questao;
    }

    public int getCod_avaliacao() {
        return cod_avaliacao;
    }

    public void setCod_avaliacao(int cod_avaliacao) {
        this.cod_avaliacao = cod_avaliacao;
    }

}
