/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.produtosregistro.model;

public class Pedido {
    private Produto produto;
    private int quantidadeSolicitada;

    public Pedido(Produto produto, int quantidadeSolicitada) throws Exception {
        if (quantidadeSolicitada > produto.getQuantidadeEstoque()) {
            throw new Exception("Quantidade solicitada excede o estoque disponível.");
        }
        this.produto = produto;
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public String gerarResumo() {
        return "Pedido: " + produto.getNome() + " - Quantidade: " + quantidadeSolicitada + " - Total: R$" + (produto.getPreco() * quantidadeSolicitada);
    }
}
