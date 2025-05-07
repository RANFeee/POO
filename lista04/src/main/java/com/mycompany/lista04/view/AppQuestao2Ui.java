/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.view;

import javax.swing.JOptionPane;

/**
 *
 * @author rnpinheiro
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        Retangulo2 retangulo = new Retangulo2();
        String altura = JOptionPane.showInputDialog(null, "Informe a altura: ");
        retangulo.setAltura(Integer.parseInt(altura));
        String comprimento = JOptionPane.showInputDialog(null, "Informe o comprimento: ");
        retangulo.setComprimento(Integer.parseInt(comprimento));
    
        JOptionPane.showMessageDialog(null, retangulo.calcularArea());
        JOptionPane.showMessageDialog(null, retangulo.calcularPerimetro());
    }   
   
}
