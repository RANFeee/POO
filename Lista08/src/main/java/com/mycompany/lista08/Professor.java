/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista08;

/**
 *
 * @author user
 */
public class Professor {
    private String nome;
    private String email;
    private Titulacao titulacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.email = email;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        if (titulacao == null) {
            throw new IllegalArgumentException("Titulaçao nao foi definido!!!");
        }
        this.titulacao = titulacao;
    }
    
    
}
