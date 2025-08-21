package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Carro {
    private String modelo;
    private String cor;
    private int velocidade;

    // Construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0; // Inicialmente, o carro está parado
    }

    // Método para acelerar o carro
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidade += incremento;
        }
    }

    // Método para frear o carro
    public void frear(int decremento) {
        if (decremento > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidade + " km/h");
    }
}
