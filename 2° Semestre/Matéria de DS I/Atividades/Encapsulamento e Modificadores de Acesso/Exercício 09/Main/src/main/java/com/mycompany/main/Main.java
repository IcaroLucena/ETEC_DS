/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "Maria");

        // Depósito
        conta.depositar(1000.00);

        // Tentativa de saque com valor válido
        conta.sacar(300.00);

        // Tentativa de saque com valor maior que o saldo
        conta.sacar(800.00);

        // Exibição das informações
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
