/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class App{
    static Scanner scanner = new Scanner(System.in);
    static Funcionario[] funcionarios = new Funcionario[2];
    public static void main(String[] args) {
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = cadastrarFuncionario();
        }
        for (int i = 0; i < funcionarios.length; i++) {
            exibirFuncionario(funcionarios[i]);
            
        }
    }
    
    public static Funcionario cadastrarFuncionario(){
        System.out.println("informe o nome do funcionario: ");
        String nome = scanner.nextLine();
        System.out.println("informe o salario do funcionario: ");
        double salario = Double.parseDouble(scanner.nextLine());
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        
        return funcionario;
    }
    
    public static void exibirFuncionario(Funcionario funcionario){
        System.out.println("Nome do funcionario " + funcionario.getNome() + " | salario " + funcionario.getSalario() + " | calculo IRPF " + funcionario.calcularIrpf()); 
    }
}
