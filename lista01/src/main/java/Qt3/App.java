/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qt3;

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
            System.out.println("informe a altura da pessoa");
            p.altura = teclado.nextDouble();
            System.out.println("informe o peso da pessoa");
            p.peso = teclado.nextDouble();
            pessoas[i] = p;
           
        }
        
    }
}
