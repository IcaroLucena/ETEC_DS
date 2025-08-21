/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.time.Year;

public class Funcionario {
    protected String nome;
    protected double salarioBruto;
    protected int anoAdmissao;

    public Funcionario(String nome, double salarioBruto, int anoAdmissao) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.anoAdmissao = anoAdmissao;
    }

    public boolean temTempoSuficiente() {
        int anoAtual = Year.now().getValue();
        return (anoAtual - anoAdmissao) >= 5;
    }

    public double calcularPL() {
        if (!temTempoSuficiente()) {
            return 0.0;
        }
        return salarioBruto; // Padrão, pode ser sobrescrito
    }

    public String getInfo() {
        return "Nome: " + nome + " | Salário: R$" + salarioBruto + " | PL: R$" + calcularPL();
    }
}
