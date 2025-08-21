/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3:"));
        double media = (n1 + n2 + n3) / 3;
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
