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
        // Instanciando as formas geométricas
        Circulo circulo = new Circulo("Círculo", 5.0);
        Retangulo retangulo = new Retangulo("Retângulo", 4.0, 6.0);
        Quadrado quadrado = new Quadrado("Quadrado", 4.0);
        
        // Exibindo as informações e áreas das formas
        System.out.println("=== Informações das Formas ===");
        
        circulo.exibirNome();
        System.out.printf("Área: %.2f\n", circulo.calcularArea());
        System.out.println("----------------------------");
        
        retangulo.exibirNome();
        System.out.printf("Área: %.2f\n", retangulo.calcularArea());
        System.out.println("----------------------------");
        
        quadrado.exibirNome();
        System.out.printf("Área: %.2f\n", quadrado.calcularArea());
        System.out.println("----------------------------");
    }
}