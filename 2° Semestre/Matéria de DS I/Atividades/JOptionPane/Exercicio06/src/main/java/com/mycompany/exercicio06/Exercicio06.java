/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número:"));
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /)");

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = x + y;
                break;
            case "-":
                resultado = x - y;
                break;
            case "*":
                resultado = x * y;
                break;
            case "/":
                if (y != 0) resultado = x / y;
                else {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero");
                    valida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida");
                valida = false;
        }

        if (valida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
