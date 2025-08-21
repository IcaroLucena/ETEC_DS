/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
class Funcionario extends Pessoa {
    private String cargo;
    private String RGM;
    
    public Funcionario(String nome, String cpf, String dataNascimento, String cargo, String RGM) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
        this.RGM = RGM;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("RGM: " + RGM);
    }
}