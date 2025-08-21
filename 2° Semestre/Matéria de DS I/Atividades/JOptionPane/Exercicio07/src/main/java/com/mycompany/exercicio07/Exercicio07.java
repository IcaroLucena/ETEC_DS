/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (m):"));
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, String.format("IMC: %.2f", imc));
    }
}
