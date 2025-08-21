/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Empresa {

    public void exibirInfo() {
        System.out.println("Empresa: TechSolutions");
        System.out.println("CNPJ: 12.345.678/0001-99");

        // Pode chamar método privado internamente
        gerarRelatorio();
    }

    private void gerarRelatorio() {
        System.out.println("Relatório confidencial gerado internamente.");
    }
}
