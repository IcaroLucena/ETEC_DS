/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.regiao.model;

public class Pessoa {
    private RegiaoBrasil regiao;
    
    public Pessoa(RegiaoBrasil regiao) {
        this.regiao = regiao;
    }
    
    public void exibirRegiao() {
        System.out.println("A pessoa é da região: " + regiao);
    }
    
    public void mudarRegiao(RegiaoBrasil novaRegiao) {
        regiao = novaRegiao;
        System.out.println("A pessoa agora e da regiao: " + regiao);
    }
}
    