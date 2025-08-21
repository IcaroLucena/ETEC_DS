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
        // Instanciando os Gerentes
        Gerente gerente1 = new Gerente("Icaro Lucena", 45, 22000, "Financeiro");
        Gerente gerente2 = new Gerente("Fernanda Lucena", 40, 23000, "Recursos Humanos");
        
        // Instanciando os Desenvolvedores
        Desenvolvedor dev1 = new Desenvolvedor("Lucas Prado", 30, 5000, "Java");
        Desenvolvedor dev2 = new Desenvolvedor("Laura Akira", 28, 3900, "Python");
        Desenvolvedor dev3 = new Desenvolvedor("Giovanna Nova", 32, 7800, "JavaScript");
        Desenvolvedor dev4 = new Desenvolvedor("Isaak Oustenha", 27, 4000, "C#");
        Desenvolvedor dev5 = new Desenvolvedor("Allisson Argent", 35, 6200, "Ruby");
        Desenvolvedor dev6 = new Desenvolvedor("Aufih Rudson", 29, 7000, "PHP");
        Desenvolvedor dev7 = new Desenvolvedor("Louisi Clark", 31, 4700, "C++");
        
        // Exibindo informações dos Gerentes
        System.out.println("---- Informações dos Gerentes ----");
        gerente1.exibirInformacoesGerente();
        gerente2.exibirInformacoesGerente();
        
        // Exibindo informações dos Desenvolvedores
        System.out.println("---- Informações dos Desenvolvedores ----");
        dev1.exibirInformacoesDesenvolvedor();
        dev2.exibirInformacoesDesenvolvedor();
        dev3.exibirInformacoesDesenvolvedor();
        dev4.exibirInformacoesDesenvolvedor();
        dev5.exibirInformacoesDesenvolvedor();
        dev6.exibirInformacoesDesenvolvedor();
        dev7.exibirInformacoesDesenvolvedor();
    }
}