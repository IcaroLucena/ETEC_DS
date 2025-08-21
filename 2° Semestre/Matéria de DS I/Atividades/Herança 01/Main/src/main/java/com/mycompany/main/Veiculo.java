package com.mycompany.main;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor que inicializa os atributos do veículo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters para acessar os atributos
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }

    // Método para exibir os dados do veículo
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}
