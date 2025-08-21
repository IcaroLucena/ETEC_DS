package com.mycompany.main;

public class CarroEletrico extends Carro {
    private double capacidadeBateria; // em kWh

    // Construtor que chama o construtor da classe Carro e inicializa a capacidade da bateria
    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, double capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel); // Inicializa os atributos herdados
        this.capacidadeBateria = capacidadeBateria;
    }

    // Getter para a capacidade da bateria
    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    // Sobrescreve o método toString() para incluir a capacidade da bateria
    @Override
    public String toString() {
        return super.toString() + ", Capacidade da Bateria: " + capacidadeBateria + " kWh";
    }
}
