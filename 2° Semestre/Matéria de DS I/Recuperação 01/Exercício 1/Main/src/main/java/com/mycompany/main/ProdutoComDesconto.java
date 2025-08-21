/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class ProdutoComDesconto extends Produto {
    private double desconto;

    public ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public void exibirDetalhesComDesconto() {
        double precoComDesconto = preco - (preco * desconto / 100);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com Desconto: R$ " + precoComDesconto);
        System.out.println("-----------------------------");
    }
}