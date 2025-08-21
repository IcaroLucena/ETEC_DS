/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
class Aluno extends Pessoa {
    private String RA;
    private String curso;
    
    public Aluno(String nome, String cpf, String dataNascimento, String RA, String curso) {
        super(nome, cpf, dataNascimento);
        this.RA = RA;
        this.curso = curso;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("RA: " + RA);
        System.out.println("Curso: " + curso);
    }
}