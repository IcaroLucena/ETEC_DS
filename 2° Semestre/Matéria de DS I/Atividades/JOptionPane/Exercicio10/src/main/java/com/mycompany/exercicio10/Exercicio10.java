/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade:");

        if (idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "Você pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode votar.");
        }
    }
}
