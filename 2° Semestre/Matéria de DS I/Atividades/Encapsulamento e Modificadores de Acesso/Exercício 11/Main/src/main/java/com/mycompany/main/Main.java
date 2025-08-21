/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda", 7.5, 5.5);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.estaAprovado()) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}
