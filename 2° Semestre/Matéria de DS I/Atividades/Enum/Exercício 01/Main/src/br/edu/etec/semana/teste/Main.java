package br.edu.etec.semana.teste;


import java.util.Scanner;
import main.DiaSemana;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 7) {
            System.out.println("Número inválido!");
        } else {
            // Pega o enum pela posição (0-based)
            DiaSemana dia = DiaSemana.values()[num - 1];
            System.out.println("Dia correspondente: " + dia);
        }

        scanner.close();
    }
}
