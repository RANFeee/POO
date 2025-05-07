/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author user
 */
public class Movimento {
    private double valor;
    private LocalDate data;
    private LocalTime hora;
    private TipoMovimento tipoMovimento;
    
    public Movimento(double valor, TipoMovimento tipoMovimento){
        this.valor = valor;
        this.tipoMovimento = tipoMovimento;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }
    
    
}
