/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author user
 */
public class Cliente {
    private String nome;
    private String endereco;
    
    public Cliente(String nome, String endereco){
        setNome(nome);
        setEndereco(endereco);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido!!");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereco invalido!!");
        }
        this.endereco = endereco;
    }
    
    
}
