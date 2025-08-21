/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.mycompany.model.*;

public class Main {

    public static void main(String[] args) {
        // Professores de Graduação
        ProfessorGraduacao prof1 = new ProfessorGraduacao("Fernanda", 3);
        ProfessorGraduacao prof2 = new ProfessorGraduacao("João", 5);

        // Professores de Mestrado
        ProfessorMestrado prof3 = new ProfessorMestrado("Luciana", 2, 4);
        ProfessorMestrado prof4 = new ProfessorMestrado("Carlos", 4, 1);

        // Exibir informações
        System.out.println(prof1.getInfo());
        System.out.println("------------------------");
        System.out.println(prof2.getInfo());
        System.out.println("------------------------");
        System.out.println(prof3.getInfo());
        System.out.println("------------------------");
        System.out.println(prof4.getInfo());
    }
}
