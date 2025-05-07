/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qt4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        Pessoa[] pessoas = new Pessoa[3];
        Pessoa p;
        for (int i = 0; i < 3; i++) {
            p = new Pessoa();
            System.out.println("informe o nome");
            p.nome = teclado.nextLine();
            System.out.println("informe a altura da pessoa");
            p.altura = teclado.nextDouble();
            System.out.println("informe o peso da pessoa");
            p.peso = teclado.nextDouble();
            pessoas[i] = p;
           
        }
        for (int i = 2; i >= 0; i--) {
            double imc = pessoas[i].calcularImc();
            System.out.println("\nPessoa " + (i + 1) + ":");
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("Peso: " + pessoas[i].peso);
            System.out.println("Altura: " + pessoas[i].altura);
            System.out.println("IMC: " + String.format("%.2f", imc));
        }
        
    }
}
