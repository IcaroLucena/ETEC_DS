/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.regiao.teste;

import br.edu.etec.regiao.model.Pessoa;
import br.edu.etec.regiao.model.RegiaoBrasil;

public class TesteRegiao {
   public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(RegiaoBrasil.NORTE);
        pessoa1.exibirRegiao();
        
        pessoa1.mudarRegiao(RegiaoBrasil.SUDESTE);
        pessoa1.mudarRegiao(RegiaoBrasil.NORDESTE);
    }
}
