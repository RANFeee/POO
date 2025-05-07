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
public class AppQuestao3Ui {
    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog(null, "Informe a altura: ");
        String comprimento = JOptionPane.showInputDialog(null, "Informe o comprimento: ");
        Retangulo2 retangulo = new Retangulo2(Integer.parseInt(altura),Integer.parseInt(comprimento));
    
        JOptionPane.showMessageDialog(null, retangulo.calcularArea());
        JOptionPane.showMessageDialog(null, retangulo.calcularPerimetro());
        
        
    }
    
}
