/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gustavo", 8.0, 9.5);

        aluno.setNota1(11.0); // Valor inválido
        aluno.setNota2(-3.0); // Valor inválido

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.estaAprovado()) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
}
