package com.mycompany.main;

public class Carro extends Veiculo {
    private String tipoDeCombustivel;

    // Construtor que chama o construtor da classe Veiculo e inicializa o tipo de combustível
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano); // Chama o construtor da classe base Veiculo
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    // Getter para o tipo de combustível
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    // Sobrescreve o método toString() para incluir o tipo de combustível
    @Override
    public String toString() {
        return super.toString() + ", Tipo de Combustível: " + tipoDeCombustivel;
    }
}
