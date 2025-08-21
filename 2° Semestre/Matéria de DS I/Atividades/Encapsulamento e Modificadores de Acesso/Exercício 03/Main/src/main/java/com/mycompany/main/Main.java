/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Produto;

public class Main {
    public static void main(String[] args) {
        // Criando um produto usando o construtor com parâmetros
        Produto produto = new Produto("Notebook", 3500.00, 5);

        // Exibindo os dados do produto
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
