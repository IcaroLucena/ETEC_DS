/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.produtosregistro.model;

import br.edu.etec.exceptions.model.PrecoInvalidoException;
import br.edu.etec.exceptions.model.QuantidadeInvalidaException;

public class Roupa extends Produto {
    private String tamanho;

    public Roupa(String nome, double preco, int quantidadeEstoque, String tamanho) throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Roupa: " + getNome() + ", Tamanho: " + tamanho + ", Preço: R$" + getPreco() + ", Estoque: " + getQuantidadeEstoque());
    }
}
