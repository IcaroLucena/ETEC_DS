/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OutroPacote;

import Modelo.ClasseA;

public class ClasseB {
    public void acessarNumero() {
        // Criando um objeto da ClasseA e tentando acessar o atributo numero
        ClasseA classeA = new ClasseA();
        // Tentar acessar diretamente o atributo numero não funcionará
        // O compilador gerará um erro aqui, pois o atributo é default (package-private)
        System.out.println("Tentando acessar numero de ClasseA: " + classeA.numero);
    }
}
