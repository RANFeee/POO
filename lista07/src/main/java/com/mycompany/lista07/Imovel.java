/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista07;

/**
 *
 * @author user
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade){
       setArea(area);
       setEndereco(endereco);
       setBairro(bairro);
       setFinalidade(finalidade);
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("endereco invalido!!!");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area < 0) {
           throw new IllegalArgumentException("Area deve ser amaior que 0!!!");
        }
        this.area = area;
    }
    
    public Bairro getBairro(){
        return bairro;
    }
    
    public void setBairro(Bairro bairro){
        if (bairro == null) {
            throw new IllegalArgumentException("bairro nao definido!!");
        }
        this.bairro = bairro;
    }
    
    public Finalidade getFinalidade(){
        return finalidade;
    }
    
    public void setFinalidade(Finalidade finalidade){
        if (finalidade == null) {
            throw new IllegalArgumentException("finalidade nao definida!!");
        }
        this.finalidade = finalidade;
    }
    
    public double calculoIptu(){
        if (area == 0) {
           throw new IllegalArgumentException("Area nao definida!!!");
        }
        double precoImovel = 0.0;
        switch (finalidade){
            case RESIDENCIAL:
                precoImovel = area * 1.0;
                break;
            case COMERCIAL:
                if (area > 0 && area <= 100) {
                    precoImovel = 500.0;
                } else if (area <= 400) {
                    precoImovel = 1000.0;
                } else if (area > 400) {
                    precoImovel = area * 2.55;
                } else {
                    throw new IllegalArgumentException("Area invalida!!!");
                }
                break;
            case INDUSTRIAL: 
                if (area <= 2000.0) {
                    precoImovel = 1000.0;
                } else if (area > 2000.0) {
                    precoImovel = area * 0.55;
                }
                break;
        }
        return precoImovel * bairro.getCoeficienteIptu();
    }
}
