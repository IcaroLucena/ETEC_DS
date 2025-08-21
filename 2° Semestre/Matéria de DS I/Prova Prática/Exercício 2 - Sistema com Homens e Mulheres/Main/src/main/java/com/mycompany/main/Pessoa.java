package com.mycompany.main;

public class Pessoa {
    private String nome;
    private char sexo;

    // Construtor
    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // Método para retornar a descrição do sexo
    public String sexoDescricao() {
        if (sexo == 'M' || sexo == 'm') {
            return "Masculino";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Feminino";
        } else {
            return "Indefinido";
        }
    }

    // Método para imprimir informações da pessoa
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexoDescricao());
    }
}
