/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author user
 */
public class Vendedor extends Funcionario{
    private double comissao;
    private double totalVendas;
    
    public Vendedor(String nome, double salarioBase, double comissao, double totalVendas){
        super(nome, salarioBase);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + (comissao * totalVendas);
    }
}
