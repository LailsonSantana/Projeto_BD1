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
    
    public Alternativa(char l,String r, boolean eh_correta, int cq){
        this.letra = l;
        this.resposta = r;
        this.eh_correta = eh_correta;
        this.cod_questao = cq;
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
