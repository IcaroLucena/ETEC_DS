/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
public class ClasseB {
    public void acessarNumero() {
        // Criando um objeto da ClasseA e acessando o atributo numero diretamente
        ClasseA classeA = new ClasseA();
        System.out.println("Acessando numero de ClasseA: " + classeA.numero);
    }
}