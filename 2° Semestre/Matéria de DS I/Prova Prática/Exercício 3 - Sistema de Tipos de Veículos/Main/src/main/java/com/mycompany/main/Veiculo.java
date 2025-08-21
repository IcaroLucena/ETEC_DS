package com.mycompany.main;

public class Veiculo {
    protected String modelo;
    protected String cor;
    protected int velocidade;

    // Construtor
    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0; // Inicialmente, o veículo está parado
    }

    // Método para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidade += incremento;
        }
    }

    // Método para frear
    public void frear(int decremento) {
        if (decremento > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }

    // Método para exibir informações do veículo
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
    }
}
