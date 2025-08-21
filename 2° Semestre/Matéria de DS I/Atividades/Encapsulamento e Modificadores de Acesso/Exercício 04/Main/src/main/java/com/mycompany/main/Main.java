/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Produto;

public class Main {
    public static void main(String[] args) {
        // Criando um produto válido
        Produto produto = new Produto("Cadeira Gamer", 1200.00, 2);

        // Tentando definir um preço inválido
        produto.setPreco(-500);  // Deve ser rejeitado com mensagem

        // Exibindo os dados do produto
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
