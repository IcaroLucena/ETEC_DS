/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário com salário válido
        Funcionario funcionario = new Funcionario("João", 2000.00, "Desenvolvedor");

        // Tentando definir um salário inválido (abaixo do mínimo)
        funcionario.setSalario(1200.00);  // Deve ser rejeitado com mensagem

        // Exibindo os dados do funcionário
        System.out.println("Informações do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Cargo: " + funcionario.getCargo());
    }
}