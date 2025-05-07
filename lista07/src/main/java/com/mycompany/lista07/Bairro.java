/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07;

/**
 *
 * @author user
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;
    
    public Bairro(String nome, double coeficienteIptu){
        setNome(nome);
        setCoeficienteIptu(coeficienteIptu);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do bairro invalido!!!");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu < 0 ) {
            throw new IllegalArgumentException("coeficiente deve ser amaior que 0!!!");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    
}
