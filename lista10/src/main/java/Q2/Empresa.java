/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Empresa {
    private ArrayList<Funcionario> funcionario;
    
    public Empresa(){
        this.funcionario = new ArrayList<>();
    }
    
    public void incluirFuncionario(Funcionario f){
        funcionario.add(f);
    }
    
    public double calcularCustoSalarios(){
        double total = 0;
        for(Funcionario f : funcionario){
            total += f.calcularSalario();
        }
        return total;
    }
    
    public void listarFuncionario(){
        for(Funcionario f : funcionario){
            System.out.println("Nome: " + f.nome + " - Salario: RS " + f.calcularSalario());
        }
    }
}
