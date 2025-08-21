/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario {
    private String departamento;
    
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    
    public void exibirInformacoesGerente() {
        exibirInformacoes();
        System.out.println("Departamento: " + departamento);
        System.out.println("-----------------------------");
    }
}