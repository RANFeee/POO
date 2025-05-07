/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista11;

/**
 *
 * @author user
 */
public class App {
      public static void main(String[] args) {
        Contas contas = new Contas(); 
        contas.incluirConta(new ContaAgua(15, 2.5)); // 15m³ a R$ 2,50
        contas.incluirConta(new MensalidadeEnsino(5, 300)); // 5 créditos a R$ 300 cada
        contas.incluirConta(new PrevidenciaPrivada(1000)); // R$ 1000 de previdência

        System.out.println("Total das contas: R$ " + contas.calcularTotalContas());

        System.out.println("\nContas de Previdência Privada:");
        for (Pagavel pagavel : contas.getContas()) {
            if (pagavel instanceof PrevidenciaPrivada) {
                PrevidenciaPrivada previdencia = (PrevidenciaPrivada) pagavel;
                System.out.println("Valor investido: R$ " + previdencia.getValor());
            }
        }
    }

   
}
