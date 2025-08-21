/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("98765-4", "Carlos");

        conta.depositar(500.00);     // Saldo: 500
        conta.sacar(200.00);         // Saque válido
        conta.sacar(400.00);         // Saque inválido (saldo insuficiente)

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
