package br.edu.etec.aulaenum.model;

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