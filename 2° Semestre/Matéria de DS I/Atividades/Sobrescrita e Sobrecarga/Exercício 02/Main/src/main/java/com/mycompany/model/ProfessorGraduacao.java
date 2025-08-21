/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

public class ProfessorGraduacao {
    protected String nome;
    protected double salarioBruto = 25000.00;
    protected int disciplinas;

    public ProfessorGraduacao(String nome, int disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public double salario(double salarioBruto, int disciplinas) {
        double desconto = salarioBruto * 0.20;
        double adicional = disciplinas * 50.0;
        return (salarioBruto - desconto) + adicional;
    }

    public String getInfo() {
        return "Professor de Graduação: " + nome +
               "\nDisciplinas: " + disciplinas +
               "\nSalário Líquido: R$" + String.format("%.2f", salario(salarioBruto, disciplinas));
    }
}
