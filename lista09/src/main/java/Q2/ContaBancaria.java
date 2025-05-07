/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ContaBancaria {
    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimento;
    
    
    public ContaBancaria(String numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimento = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("deposito deve ser maior q zero!!");
        } else if(valor > 0){
            saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if (valor > saldo) {
            throw new IllegalArgumentException("saldo insuficiente!!");
        } else if(valor > 0 && valor <= saldo){
            saldo -= valor;
        }
        
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
    
    public ArrayList<Movimento> getMovimento(){
        return movimento;
    }
    
    protected void inclurMovimento(Movimento m){
        movimento.add(m);
    }
    
    
}
