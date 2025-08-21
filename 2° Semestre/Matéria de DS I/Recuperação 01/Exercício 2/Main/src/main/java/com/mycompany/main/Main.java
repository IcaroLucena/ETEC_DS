/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // Instanciando os Carros
        Carro hondaCivic = new Carro("Honda Civic", "ABC1234", 2020, 4);
        Carro toyotaEtios = new Carro("Toyota Etios", "DEF5678", 2019, 4);
        Carro fordK = new Carro("Ford K", "GHI9012", 2021, 2);
        
        // Instanciando as Motos
        Moto hondaBiz = new Moto("Honda Biz", "JKL3456", 2021, 125);
        Moto yamahaXT660R = new Moto("Yamaha XT660R", "MNO7890", 2022, 660);
        Moto suzukiGS500 = new Moto("Suzuki GS500", "PQR1234", 2020, 500);
        
        // Exibindo informações dos Carros
        System.out.println("---- Informações dos Carros ----");
        hondaCivic.exibirInformacoesCarro();
        toyotaEtios.exibirInformacoesCarro();
        fordK.exibirInformacoesCarro();
        
        // Exibindo informações das Motos
        System.out.println("---- Informações das Motos ----");
        hondaBiz.exibirInformacoesMoto();
        yamahaXT660R.exibirInformacoesMoto();
        suzukiGS500.exibirInformacoesMoto();
    }
}