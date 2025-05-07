/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista02;

/**
 *
 * @author user
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.trim().isEmpty()){
            throw new IllegalArgumentException("Numero da sua conta invalida");
        }
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()){
            throw new IllegalArgumentException("Numero da sua conta invalida");
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if (valor < 0) {
            throw new IllegalArgumentException("Deposito invalido, o valor nao pode ser negativo");
        }
        this.saldo += valor;
        
    }
    
    public void sacar(double valor){
        if (valor < 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Saque invalido, o saque nao pode ser negativo ou saldo insuficiente");
        }
        this.saldo -= valor;
    }
    
    public void transferir(ContaBancaria destino, double valor){
        sacar(valor);
        destino.depositar(valor);
    }
}
