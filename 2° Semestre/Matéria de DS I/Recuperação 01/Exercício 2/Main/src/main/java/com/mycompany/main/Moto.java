/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String placa, int ano, int cilindrada) {
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }
    
    public void exibirInformacoesMoto() {
        // Exibe as informações gerais do veículo
        exibirInformacoes();
        // Informações específicas da moto
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("-----------------------------");
    }
}