/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;
    
    public Desenvolvedor(String nome, int idade, double salario, String linguagemProgramacao) {
        super(nome, idade, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }
    
    public void exibirInformacoesDesenvolvedor() {
        exibirInformacoes();
        System.out.println("Linguagem de Programação: " + linguagemProgramacao);
        System.out.println("-----------------------------");
    }
}