/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio09;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (valor >= 10 && valor <= 20) {
            JOptionPane.showMessageDialog(null, "Está dentro do intervalo [10, 20]");
        } else {
            JOptionPane.showMessageDialog(null, "Fora do intervalo");
        }
    }
}
