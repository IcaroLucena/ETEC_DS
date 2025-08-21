/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Relogio;

public class Main {
    public static void main(String[] args) {
        // Criando um relógio com minuto válido
        Relogio relogio = new Relogio(30); // Minuto dentro da faixa

        // Tentando definir um minuto inválido
        relogio.setMinuto(70);  // Deve ser rejeitado com mensagem

        // Exibindo os dados do relógio
        System.out.println("Relógio:");
        System.out.println("Minuto: " + relogio.getMinuto());
    }
}
