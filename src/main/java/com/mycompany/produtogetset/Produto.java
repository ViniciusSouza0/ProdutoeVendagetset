package com.mycompany.produtogetset;

public class Produto {
    
private String nome;
private int valor;


//Construtor
public Produto (String nome, int valor){
    this.nome = nome;
    this.valor = valor;
}

//Metodos Get
public String getNome(){
    return nome;
}
public int getValor(){
    return valor;
}


//Metodos Set
public void setNome(String nome){
this.nome =  nome;
}
public void setIdade(int valor){
this.valor = valor;
}
}

    
    
    


    

