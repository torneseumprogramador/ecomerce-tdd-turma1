package com.didox.ecommerce.models;

public class Produto {
    private String codigo;
    private String nome;
    private String descricao;
    private int quantidade;
    private double valor;

    public String getCodigo() {
        return codigo.toUpperCase();
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        if(this.codigo == null || this.codigo.isEmpty()){
            this.codigo = this.nome.substring(0, 3) + "-" + this.nome.length();
        }
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
