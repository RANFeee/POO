/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista09Q1;

/**
 *
 * @author user
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;
    
    public ContaEspecial(String numero, Cliente titular, double limiteCredito){
        super(numero, titular);
        setLimiteCredito(limiteCredito);
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor){
        if (valor > getSaldo()+getLimiteCredito()) {
            throw new IllegalArgumentException("saldo insuficiente!!");
            
        } else if (valor > 0 && valor <= (getSaldo() + limiteCredito)) {
            setSaldo(getSaldo() - valor);
        }
       
    }
    
    
}
