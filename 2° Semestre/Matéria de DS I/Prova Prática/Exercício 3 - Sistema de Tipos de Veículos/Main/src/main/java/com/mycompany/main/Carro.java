package com.mycompany.main;

// A classe Carro herda da classe Veiculo
public class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(String modelo, String cor, int numeroPortas) {
        super(modelo, cor); // Chama o construtor da classe base
        this.numeroPortas = numeroPortas;
    }

    // Sobrescrevendo o método exibirInformacoes()
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe base
        System.out.println("Número de Portas: " + numeroPortas);
    }
}
