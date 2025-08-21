/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import Modelo.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa();

        // Acesso permitido - método público
        emp.exibirInfo();

        // Acesso negado - método privado (descomente para testar o erro de compilação)
        // emp.gerarRelatorio(); // <- Isso causará erro de compilação
    }
}
