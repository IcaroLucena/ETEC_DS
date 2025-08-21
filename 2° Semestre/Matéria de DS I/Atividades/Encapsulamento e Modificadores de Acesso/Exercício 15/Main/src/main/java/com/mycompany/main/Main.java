/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Endereco;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        
        endereco.setRua("Rua das Flores");
        endereco.setBairro("Centro");
        
        // Teste com CEP inválido
        endereco.setCep("1234567");    // 7 dígitos → inválido
        endereco.setCep("12A45678");   // Letras → inválido

        // Teste com CEP válido
        endereco.setCep("12345678");   // Válido

        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("CEP: " + endereco.getCep());
    }
}
