/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package main;

public enum DiaSemana {
    SEGUNDA("Segunda-Feira"),
    TERCA("Terça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");  // último valor termina com ponto-e-vírgula

    private String nomeCompleto;

    // Construtor do enum — deve ter o mesmo nome "DiaSemana"
    private DiaSemana(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Getter
    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
