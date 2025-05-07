/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01Qt1;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
       
        Pessoa p = new Pessoa();
        p.altura = 1.75;
        p.peso = 78;
        System.out.println("O Imc da pessoa eh: " + p.calcularImc());
    }
}
