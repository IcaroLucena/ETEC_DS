/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

public class ProfessorMestrado extends ProfessorGraduacao {
    private int artigosPublicados;

    public ProfessorMestrado(String nome, int disciplinas, int artigosPublicados) {
        super(nome, disciplinas);
        this.artigosPublicados = artigosPublicados;
    }

    // Sobrecarga de método
    public double salario(double salarioBruto, int disciplinas, int artigos) {
        double base = super.salario(salarioBruto, disciplinas);
        double adicionalArtigos = artigos * 150.0;
        return base + adicionalArtigos;
    }

    @Override
    public String getInfo() {
        return "Professor de Mestrado: " + nome +
               "\nDisciplinas: " + disciplinas +
               "\nArtigos Publicados: " + artigosPublicados +
               "\nSalário Líquido: R$" + String.format("%.2f", salario(salarioBruto, disciplinas, artigosPublicados));
    }
}
