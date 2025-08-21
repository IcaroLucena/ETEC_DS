/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos Silva", "123.456.789-00", "01/01/1980");
        Aluno aluno = new Aluno("Ana Souza", "987.654.321-00", "15/05/2002", "202310001", "Engenharia");
        Professor professor = new Professor("Marcos Pereira", "111.222.333-44", "23/09/1975", "Matemática", "RF12345");
        Funcionario funcionario = new Funcionario("Joana Lima", "555.666.777-88", "10/12/1985", "Secretária", "RGM98765");
        
        System.out.println("--- Pessoa ---");
        pessoa.exibirInformacoes();
        System.out.println();
        
        System.out.println("--- Aluno ---");
        aluno.exibirInformacoes();
        System.out.println();
        
        System.out.println("--- Professor ---");
        professor.exibirInformacoes();
        System.out.println();
        
        System.out.println("--- Funcionário ---");
        funcionario.exibirInformacoes();
    }
}
