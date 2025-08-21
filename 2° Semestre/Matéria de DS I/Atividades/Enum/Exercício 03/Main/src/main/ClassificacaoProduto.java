/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public enum ClassificacaoProduto {
    BASICO("Produto Simples"),
    PADRAO("Produto Padrão"),
    PREMIUM("Produto de Alto Nível");

    private final String descricao;

    private ClassificacaoProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}