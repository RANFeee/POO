/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05;

/**
 *
 * @author user
 */

public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Construtor que cria um ponto na origem (0 ,0).
     */
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    /**
     * Construtor que cria um ponto com as coordenadas especificas
     * @param x A coordenada X do ponto.
     * @param y A coordenada Y do ponto.
     */
    public Ponto(int x, int y){
        setX(x);
        setY(y);
    }
    /**
     * construtor que indentifica o quadrante do ponto.
     * @return Quadrante.
     */
    
    public Quadrante indentificarQuadrante(){
        if (x > 0 && y > 0) {
           return Quadrante.PRIMEIRO; 
        }
        if (x < 0 && y > 0) {
           return Quadrante.SEGUNDO; 
        }
        if (x < 0 && y < 0) {
           return Quadrante.TERCEIRO; 
        }
        if (x > 0 && y < 0) {
           return Quadrante.QUARTO; 
        }
        return Quadrante.NENHUM;
    }
    /**
     * verifica se o ponto esta sobre o eixo x.
     * Um ponto esta no eixo x quando a sua coordenada y se iguala a 0.
     * @return {@code true} se o ponto estiver no eixo x, caso ao contrario {@code false}.
     */
    
    public boolean estaIncidindoSobreX(){
        return this.y == 0;
    }
    
    /**
     * verifica se o ponto esta sobre o eixo y.
     * Um ponto esta no eixo y quando a sua coordenada x se iguala a 0.
     * @return {@code true} se o ponto estiver no eixo y, caso ao contrario {@code false}.
     */
    public boolean estaIncidindoSobreY(){
        return this.x == 0;
    }
    /**
     * Calcula a distancia entre dois pontos cartesianos
     * @param Ponto
     * @return A discatancia entre dois pontos
     */
    
    public double calcularDistancia(Ponto Ponto){
        return Math.sqrt(Math.pow((x - x), 2) + Math.pow((y - y) ,2));
    }
    
    /**
     * Calcula a distancia entre dois pontos cartesianos
     * @param p1 O primeiro ponto
     * @param p2 O segundo ponto
     * @return A distancia entre dois pontos
     */
    public static double calcularDistancia(Ponto p1, Ponto p2){
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy ,2));
    }
}
