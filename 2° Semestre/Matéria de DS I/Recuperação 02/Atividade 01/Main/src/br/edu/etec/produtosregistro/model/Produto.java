/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.produtosregistro.model;

import br.edu.etec.exceptions.model.PrecoInvalidoException;
import br.edu.etec.exceptions.model.QuantidadeInvalidaException;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) throws PrecoInvalidoException, QuantidadeInvalidaException {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) throws QuantidadeInvalidaException {
        if (quantidadeEstoque < 0) {
            throw new QuantidadeInvalidaException("Quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract void exibirDetalhes();
}
