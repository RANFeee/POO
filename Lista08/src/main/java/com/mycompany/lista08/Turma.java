/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista08;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Turma {
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return new ArrayList<>(alunos); // retorna uma copia da prr da lista
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem(){
        if (alunos.isEmpty()) {
            throw new IllegalArgumentException("Aluno invalido");
        }
        
        Aluno melhorAluno = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.getNotaEnem() > melhorAluno.getNotaEnem()) {
                melhorAluno = aluno;
            }
        }
        return melhorAluno;
    }
}
