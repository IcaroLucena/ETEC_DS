/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // Instanciando os produtos com desconto
        ProdutoComDesconto caderno = new ProdutoComDesconto("Caderno", 10.00, 15.0);
        ProdutoComDesconto caneta = new ProdutoComDesconto("Caneta", 2.50, 10.0);
        ProdutoComDesconto apontador = new ProdutoComDesconto("Apontador", 1.50, 5.0);
        
        // Exibindo detalhes de cada produto
        System.out.println("Detalhes dos Produtos com Desconto:");
        caderno.exibirDetalhesComDesconto();
        caneta.exibirDetalhesComDesconto();
        apontador.exibirDetalhesComDesconto();
    }
}