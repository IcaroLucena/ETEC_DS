/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        if (a > b) {
            JOptionPane.showMessageDialog(null, "O maior é: " + a);
        } else if (b > a) {
            JOptionPane.showMessageDialog(null, "O maior é: " + b);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }
}
