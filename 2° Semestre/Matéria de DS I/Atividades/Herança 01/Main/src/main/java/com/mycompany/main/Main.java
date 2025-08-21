package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Veiculo
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2020);
        
        // Instanciando um objeto da classe Carro
        Carro carro = new Carro("Ford", "Fusion", 2018, "Gasolina");
        
        // Instanciando um objeto da classe CarroEletrico
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2021, "Elétrico", 100);

        // Exibindo as características de cada veículo
        System.out.println("Veículo: " + veiculo);
        System.out.println("Carro: " + carro);
        System.out.println("Carro Elétrico: " + carroEletrico);
    }
}
