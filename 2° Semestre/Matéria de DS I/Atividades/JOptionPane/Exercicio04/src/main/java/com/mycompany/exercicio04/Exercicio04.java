/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Par");
        } else {
            JOptionPane.showMessageDialog(null, "Ímpar");
        }
    }
}
