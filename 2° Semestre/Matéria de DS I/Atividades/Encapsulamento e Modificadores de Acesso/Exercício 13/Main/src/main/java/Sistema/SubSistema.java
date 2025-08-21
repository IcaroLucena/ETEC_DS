/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

public class SubSistema extends ConfiguracaoSistema {

    public void mostrarVersao() {
        // Acesso direto ao atributo protected da superclasse
        System.out.println("Versão do sistema (acessada na subclasse): " + versaoSistema);
    }
}
