/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio08;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
        double fahrenheit = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahrenheit);
    }
}
