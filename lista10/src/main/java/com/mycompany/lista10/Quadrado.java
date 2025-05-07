/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista10;

/**
 *
 * @author user
 */
public class Quadrado extends Figura {
    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
    
}
