/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import com.mycompany.model.*;

public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new GrupoABC("Carlos", 4000, 2015);
        Funcionario f2 = new GrupoDEF("Ana", 3000, 2022);
        Funcionario f3 = new GrupoGHI("Marcos", 3500, 2018);

        System.out.println(f1.getInfo());
        System.out.println(f2.getInfo());
        System.out.println(f3.getInfo());
    }
}
