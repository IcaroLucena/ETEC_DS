package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos Silva", 'M');
        Pessoa pessoa2 = new Pessoa("Mariana Souza", 'F');
        Pessoa pessoa3 = new Pessoa("Alex Morgan", 'X'); // Teste com valor inválido

        System.out.println("Informações das Pessoas:\n");

        pessoa1.imprimirInformacoes();
        System.out.println();

        pessoa2.imprimirInformacoes();
        System.out.println();

        pessoa3.imprimirInformacoes();
    }
}
