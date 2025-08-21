package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Veículo Genérico:\n");
        Veiculo veiculo1 = new Veiculo("Moto Yamaha", "Azul");
        veiculo1.exibirInformacoes();

        veiculo1.acelerar(60);
        System.out.println("\nApós acelerar:");
        veiculo1.exibirInformacoes();

        veiculo1.frear(20);
        System.out.println("\nApós frear:");
        veiculo1.exibirInformacoes();

        System.out.println("\n----------------------\n");

        System.out.println("Carro Específico:\n");
        Carro carro1 = new Carro("Honda Civic", "Vermelho", 4);
        carro1.exibirInformacoes();

        carro1.acelerar(80);
        System.out.println("\nApós acelerar:");
        carro1.exibirInformacoes();

        carro1.frear(30);
        System.out.println("\nApós frear:");
        carro1.exibirInformacoes();
    }
}
