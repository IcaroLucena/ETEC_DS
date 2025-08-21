/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    // Salário mínimo vigente
    private static final double SALARIO_MINIMO = 1412.00;

    // Construtor
    public Funcionario(String nome, double salario, String cargo) {
        setNome(nome);
        setSalario(salario);
        setCargo(cargo);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            System.out.println("Erro: Salário abaixo do salário mínimo!");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("Cargo inválido!");
        }
    }
}