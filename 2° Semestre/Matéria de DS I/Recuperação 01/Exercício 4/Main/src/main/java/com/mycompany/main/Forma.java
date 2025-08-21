/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Forma: " + nome);
    }
}