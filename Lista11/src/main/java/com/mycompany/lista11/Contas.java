/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Contas {
    private List<Pagavel> contas;

    public Contas() {
        this.contas = new ArrayList<>();
    }

    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }

    public List<Pagavel> getContas() {
        return contas;
    }

    public double calcularTotalContas() {
        double total = 0;
        for (Pagavel conta : contas) {
            total += conta.calcularValorPagar();
        }
        return total;
    }
}
