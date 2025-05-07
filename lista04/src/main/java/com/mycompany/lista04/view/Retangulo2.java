/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista04.view;

/**
 *
 * @author rnpinheiro
 */
public class Retangulo2 {
    private int altura;
    private int comprimento;
    
    
    public Retangulo2(){
        this.altura = 0;
        this.comprimento = 0;
    }
    
    public Retangulo2(int altura, int comprimento){
        
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura ");
        }
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento ");
        }
    }
    
    /**
     * realiza o calculo do Perimetro 
     * @return o resultado do calculo
     */
    public double calcularPerimetro(){
        double perimetro = (this.altura * 2) + (this.comprimento * 2);
        return perimetro;
        
    }
    
    /**
     * realiza o calculo da Area
     * @return o resultado do calculo
     */
    public double calcularArea(){
        double area = this.altura * this.comprimento;
        return area;
    }
    
}
