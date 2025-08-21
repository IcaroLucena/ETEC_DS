/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio01;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Positivo");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Zero");
        }
    }
}
