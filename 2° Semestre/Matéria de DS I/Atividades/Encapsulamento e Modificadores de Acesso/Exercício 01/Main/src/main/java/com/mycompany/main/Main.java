/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João da Silva", 19, "123.456.789-00");

        System.out.println("Informações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
    }
}
