package br.edu.etec.aulaenum.teste;

import br.edu.etec.aulaenum.model.Pessoa;
import br.edu.etec.aulaenum.model.RegiaoBrasil;

public class TesteRegiao {
   public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(RegiaoBrasil.NORTE);
        pessoa1.exibirRegiao();
        
        pessoa1.mudarRegiao(RegiaoBrasil.SUDESTE);
        pessoa1.mudarRegiao(RegiaoBrasil.NORDESTE);
    }
}