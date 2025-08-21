/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.passagem.model;

import br.edu.etec.passagem.exceptions.ValorPassagemInvalidoException;

public abstract class Passagem {
    private String nomePassageiro;
    private String destino;
    private double valor;

    public Passagem(String nomePassageiro, String destino, double valor) throws ValorPassagemInvalidoException {
        this.nomePassageiro = nomePassageiro;
        this.destino = destino;
        setValor(valor);
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getDestino() {
        return destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorPassagemInvalidoException {
        if (valor < 100.0) {
            throw new ValorPassagemInvalidoException("O valor da passagem deve ser no mínimo R$100,00.");
        }
        this.valor = valor;
    }

    public abstract void mostrarDetalhes();
}
