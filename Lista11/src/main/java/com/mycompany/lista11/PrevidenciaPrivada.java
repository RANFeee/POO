/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista11;

/**
 *
 * @author user
 */
public class PrevidenciaPrivada implements Pagavel {
    private double valor;

    public PrevidenciaPrivada(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularValorPagar() {
        return valor;
    }

    public void investir() {
        System.out.println("Investindo em Previdência Privada: R$ " + valor);
    }

    public double getValor() {
        return valor;
    }
}
