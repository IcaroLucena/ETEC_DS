/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Admin
 */
public class Produto {
    private ClassificacaoProduto descricao;
    
    public Produto(ClassificacaoProduto descricao) {
        this.descricao = descricao;
    }
    
    public void exibirDescricao() {
    System.out.println("O produto tem a descrição: " + descricao.getDescricao());
    }
}