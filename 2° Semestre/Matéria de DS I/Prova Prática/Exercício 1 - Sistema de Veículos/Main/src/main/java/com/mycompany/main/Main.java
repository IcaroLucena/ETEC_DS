package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota Corolla", "Preto");
        meuCarro.exibirInfo();

        meuCarro.acelerar(50);
        System.out.println("\nApós acelerar:");
        meuCarro.exibirInfo();

        meuCarro.frear(20);
        System.out.println("\nApós frear:");
        meuCarro.exibirInfo();
    }
}
