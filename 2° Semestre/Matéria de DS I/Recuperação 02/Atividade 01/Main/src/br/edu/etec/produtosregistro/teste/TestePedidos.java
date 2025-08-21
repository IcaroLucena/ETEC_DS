/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.produtosregistro.teste;

import br.edu.etec.produtosregistro.model.Roupa;
import br.edu.etec.produtosregistro.model.Pedido;
import br.edu.etec.produtosregistro.model.Produto;
import br.edu.etec.produtosregistro.model.Livro;
import br.edu.etec.produtosregistro.model.Eletronico;
import br.edu.etec.exceptions.model.PrecoInvalidoException;
import br.edu.etec.exceptions.model.QuantidadeInvalidaException;

public class TestePedidos {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];

        try {
            produtos[0] = new Livro("Java Básico", 50.0, 10, "João Silva");
            produtos[1] = new Eletronico("Smartphone", 1200.0, 5, 12);
            produtos[2] = new Roupa("Camiseta", 30.0, 20, "M");

            for (Produto p : produtos) {
                p.exibirDetalhes();
            }

            Pedido pedido1 = new Pedido(produtos[0], 2);
            System.out.println(pedido1.gerarResumo());

            Pedido pedido2 = new Pedido(produtos[1], 6); // Excedendo o estoque

        } catch (PrecoInvalidoException | QuantidadeInvalidaException e) {
            System.out.println("Erro de dados: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro no pedido: " + e.getMessage());
        }

        // Teste com erro proposital
        try {
            Produto produtoInvalido = new Roupa("Jaqueta", -150.0, 10, "G");
        } catch (PrecoInvalidoException | QuantidadeInvalidaException e) {
            System.out.println("Erro proposital detectado: " + e.getMessage());
        }
    }
}
