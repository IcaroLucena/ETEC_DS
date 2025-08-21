/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
class Professor extends Pessoa {
    private String disciplina;
    private String RF;
    
    public Professor(String nome, String cpf, String dataNascimento, String disciplina, String RF) {
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.RF = RF;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("RF: " + RF);
    }
}