package com.example.model;

public class Alternativa {

    private char letra;
    private String resposta;
    private boolean eh_correta;
    private int cod_questao;

    /**
     * 
     * @param l // letra indentificadora
     * @param r // resposta da alternativa
     * @param ec // boolean se a questao eh verdadeira
     * @param cq // codigo da questao
     */
    
    public Alternativa(char l,String r,int cq){
        letra = l;
        resposta = r;
        eh_correta = false; // seta como true caso a questao for a correta
        cod_questao = cq;
    }

    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    public boolean isEh_correta() {
        return eh_correta;
    }
    public void setEh_correta(boolean eh_correta) {
        this.eh_correta = eh_correta;
    }
    public int getCod_questao() {
        return cod_questao;
    }
    public void setCod_questao(int cod_questao) {
        this.cod_questao = cod_questao;
    }

    
}
