/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor com parâmetros
    public Pessoa(String nome, int idade, String cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    // Getters e Setters com validação de idade
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: Idade não pode ser negativa!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }
}