/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qt2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("informe a altura da pessoa");
        p.altura = teclado.nextDouble();
        System.out.println("informe o peso da pessoa");
        p.peso = teclado.nextDouble();
        System.out.println("O Imc da pessoa eh: " + p.calcularImc());
    }
}
