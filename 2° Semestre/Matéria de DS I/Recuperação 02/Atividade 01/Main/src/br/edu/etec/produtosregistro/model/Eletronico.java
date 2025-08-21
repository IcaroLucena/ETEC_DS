/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.produtosregistro.model;

import br.edu.etec.exceptions.model.PrecoInvalidoException;
import br.edu.etec.exceptions.model.QuantidadeInvalidaException;

public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses) throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletrônico: " + getNome() + ", Preço: R$" + getPreco() + ", Estoque: " + getQuantidadeEstoque() + ", Garantia: " + garantiaMeses + " meses");
    }
}
