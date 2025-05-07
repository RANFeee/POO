/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qt3;

/**
 *
 * @author user
 */
public class Pessoa {
    double altura;
    double peso;
    
    public double calcularImc(){
        return peso/(altura * altura);
                 
    }
}
