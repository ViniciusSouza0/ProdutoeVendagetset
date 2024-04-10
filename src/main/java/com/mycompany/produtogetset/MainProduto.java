package com.mycompany.produtogetset;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
              System.out.println("Escolha um produto: ");
               String nome = teclado.nextLine();
         
                 System.out.println("Digite a valor: ");
                   int valor = teclado.nextInt();
        
                    Produto p = new Produto (nome, valor);
        
                       System.out.println("Nome: " + p.getNome());
                          System.out.println("valor: " + p.getValor());
    
    }
}
    
    

