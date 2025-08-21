/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.passagem.teste;

import br.edu.etec.passagem.model.PassagemPrime;
import br.edu.etec.passagem.model.PassagemExecutiva;
import br.edu.etec.passagem.model.Passagem;
import br.edu.etec.passagem.model.PassagemEconomica;
import br.edu.etec.passagem.exceptions.ValorPassagemInvalidoException;

public class TesteReservas {
    public static void main(String[] args) {
        Passagem[] passagens = new Passagem[3];

        try {
            passagens[0] = new PassagemEconomica("Carlos Silva", "São Paulo", 300.0, true);
            passagens[1] = new PassagemExecutiva("Ana Beatriz", "Nova York", 2500.0, 2);
            passagens[2] = new PassagemPrime("João Pedro", "Dubai", 5500.0, "Limousine + Massagem VIP");

            System.out.println("Detalhes das passagens:");
            for (Passagem p : passagens) {
                p.mostrarDetalhes();
            }

        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Erro no valor da passagem: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // Teste com valor inválido
        try {
            Passagem passagemInvalida = new PassagemExecutiva("Marcos Lima", "Londres", 90.0, 1);
        } catch (ValorPassagemInvalidoException e) {
            System.out.println("Erro proposital: " + e.getMessage());
        }
    }
}
