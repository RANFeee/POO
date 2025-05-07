/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class FuncionarioTest{
    
    @Test
    public void test_identificarFaixaIrpf() {
        Funcionario func = new Funcionario(850.00);
        assertEquals(FaixaIrpf.TERCEIRA, func.identificarFaixaIrpf());
    }

    
}
