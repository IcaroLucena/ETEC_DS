/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.passagem.model;

import br.edu.etec.passagem.exceptions.ValorPassagemInvalidoException;

public class PassagemExecutiva extends Passagem {
    private int numeroRefeicoes;

    public PassagemExecutiva(String nomePassageiro, String destino, double valor, int numeroRefeicoes) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valor);
        this.numeroRefeicoes = numeroRefeicoes;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Executiva - Passageiro: " + getNomePassageiro() + ", Destino: " + getDestino() + ", Valor: R$" + getValor()
                + ", Refeições: " + numeroRefeicoes);
    }
}
