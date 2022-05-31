package com.example.model;

public class Material {

    private int codigo;
    private String tipo;
    private long mat_professor;
    private String conteudo;

    /**
     * 
     * @param tipo
     * @param matricula
     */
    public Material(String tipo, long matricula,String conteudo){
        this.tipo = tipo;
        mat_professor = matricula;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public long getMat_professor() {
        return mat_professor;
    }
    public void setMat_professor(long mat_professor) {
        this.mat_professor = mat_professor;
    }


    public String getConteudo() {
        return conteudo;
    }


    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
  
}
