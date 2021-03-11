package br.com.impacta.lab.controller;

public class Produto {

  public Produto(){}

  public Produto(int id, String descricao, double valor){
    this.id = id;
    this.descricao = descricao;
    this.valor = valor;
  }

  private int id;
  private String descricao;
  private double valor;

  public int getId(){
    return this.id;
  }

  public void setId(int id){
    this.id = id;
  }

  public String getDescricao(){
    return this.descricao;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public double getValor(){
    return this.valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

}