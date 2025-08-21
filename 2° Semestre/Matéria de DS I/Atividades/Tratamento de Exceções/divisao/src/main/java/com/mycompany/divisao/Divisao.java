/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        
        try {
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();

            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }

            double resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Digite apenas números.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}
