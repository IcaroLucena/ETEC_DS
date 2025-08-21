/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }
    
    public void exibirInformacoesCarro() {
        // Exibe as informações gerais do veículo
        exibirInformacoes();
        // Informações específicas do carro
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("-----------------------------");
    }
}