/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.passagem.model;

import br.edu.etec.passagem.exceptions.ValorPassagemInvalidoException;

public class PassagemEconomica extends Passagem {
    private boolean bagagemInclusa;

    public PassagemEconomica(String nomePassageiro, String destino, double valor, boolean bagagemInclusa) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valor);
        this.bagagemInclusa = bagagemInclusa;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Econômica - Passageiro: " + getNomePassageiro() + ", Destino: " + getDestino() + ", Valor: R$" + getValor()
                + ", Bagagem inclusa: " + (bagagemInclusa ? "Sim" : "Não"));
    }
}
