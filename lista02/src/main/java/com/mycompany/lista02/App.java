/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args) {
        ContaBancaria c1,c2;
        
        c1 = new ContaBancaria();
        
        c1.setNumero("1222-3");
        c1.setTitular("vini");
        
        c2 = new ContaBancaria();
        
        c2.setNumero("22255-9");
        c2.setTitular("abrao");
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        c2.sacar(3000);
        c2.transferir(c1,1800);
        
        System.out.println("Titular 1: " + c1.getTitular() + " saldo " + c1.getSaldo());
        System.out.println("Titular 2: " + c2.getTitular() + " saldo " + c2.getSaldo());
    }
}
