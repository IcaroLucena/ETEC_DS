/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.produtosregistro.model;

import br.edu.etec.exceptions.model.PrecoInvalidoException;
import br.edu.etec.exceptions.model.QuantidadeInvalidaException;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, int quantidadeEstoque, String autor) throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getNome() + ", Autor: " + autor + ", Preço: R$" + getPreco() + ", Estoque: " + getQuantidadeEstoque());
    }
}
