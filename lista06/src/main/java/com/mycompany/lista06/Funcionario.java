/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06;

/**
 *
 * @author user
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido!!!");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salario deve ser maior que 0!!!");
        }
        this.salario = salario;
    }
    
    public FaixaIrpf identificarFaixaIrpf(){
        if(salario <= 1903.98){
            return FaixaIrpf.PRIMEIRA;
        }
        if(salario >= 1903.99 && salario <= 2826.65){
            return FaixaIrpf.SEGUNDA;
        }
        if(salario >= 2826.66 && salario <= 3751.05){
            return FaixaIrpf.TERCEIRA;
        }
        if(salario >= 3751.06 && salario <= 4664.68){
            return FaixaIrpf.QUARTA;
        }
        return FaixaIrpf.QUINTA;
    }
    
    public double calcularIrpf(){
        double aliquota = 0;
        double baseCalculo;
        if(salario <= 1903.98){
            return aliquota;
            
        } else if (salario <= 2826.65) {
            baseCalculo = salario - 1903.98;
            aliquota = baseCalculo * 0.075;
            
        } else if (salario <= 3751.05){
            double faixa1 = 2826.65 - 1903.98;
            double faixa2 = salario - 2826.65;
            aliquota = (faixa1 * 0.075) + (faixa2 * 0.15);
            
        } else if (salario <= 4664.68){
            baseCalculo = salario - 3751.05;
            aliquota = baseCalculo * 0.225;
            
        } else if (salario > 4664.69){
            aliquota = salario * 0.275;
            
        }
        return aliquota;
    }
    
}
