/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class ImovelTest {
    
    @Test
    public void testAreaNegativa() {
        Bairro bairro = new Bairro("centro",1.0);
        assertThrows(IllegalArgumentException.class, () -> new Imovel("rua A", -5, bairro, Finalidade.RESIDENCIAL)); 
    }
    @Test
    public void testSemArea() {
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 0, bairro, Finalidade.RESIDENCIAL);
        assertThrows(IllegalArgumentException.class, imovel::calculoIptu); 
    }
    @Test
    public void testSemFinalidade() {
        Bairro bairro = new Bairro("Centro",1.0);
        assertThrows(IllegalArgumentException.class, () -> new Imovel("Rua A", 250, bairro, null)); 
    }
    @Test
    public void testSemBairro() {
        assertThrows(IllegalArgumentException.class, () -> new Imovel("Rua A", 250, null, Finalidade.RESIDENCIAL)); 
       
    }
    @Test
    public void testImovelResidencial(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 400, bairro, Finalidade.RESIDENCIAL);
        assertEquals(400.0, imovel.calculoIptu());
    }
    @Test
    public void testImovelComercial100(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 80, bairro, Finalidade.COMERCIAL);
        assertEquals(500.0, imovel.calculoIptu());
    }
    @Test
    public void testImovelComercialEntre100e400(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 250, bairro, Finalidade.COMERCIAL);
        assertEquals(1000.0, imovel.calculoIptu());
    }
    @Test
    public void testImovelComercialAcimade400(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 500, bairro, Finalidade.COMERCIAL);
        assertEquals(1275.0, imovel.calculoIptu());
    }
    @Test
    public void testImovelIndustrial(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 2000, bairro, Finalidade.INDUSTRIAL);
        assertEquals(1000.0, imovel.calculoIptu());
    }
    @Test
    public void testImovelIndustrialAcimaDe2000(){
        Bairro bairro = new Bairro("Centro",1.0);
        Imovel imovel = new Imovel("Rua A", 3000, bairro, Finalidade.INDUSTRIAL);
        assertEquals(1650.0, imovel.calculoIptu(), 0.01);
    }
    @Test
    public void testImovelIndustrialIptu2emeio(){
        Bairro bairro = new Bairro("Centro",2.5);
        Imovel imovel = new Imovel("Rua A", 500, bairro, Finalidade.RESIDENCIAL);
        assertEquals(1250.0, imovel.calculoIptu(), 0.01);
    }
    
}
