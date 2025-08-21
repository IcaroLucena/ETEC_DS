/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.meses.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 12) {
            System.out.println("Número inválido!");
        } else {
            Mes mes = Mes.values()[num - 1];
            System.out.println("Mês correspondente: " + mes + " (" + mes.getNumero() + ")");
        }

        scanner.close();
    }
}