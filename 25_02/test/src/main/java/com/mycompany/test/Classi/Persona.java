/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.Classi;

/**
 *
 * @author davide.mirra
 */

public class Persona {
    
    private String nome;
    private String residenza;
    private String eta;

    public Persona(String nome, String residenza, String eta) {
        this.nome = nome;
        this.residenza = residenza;
        this.eta = eta;
    }
    

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", residenza=" + residenza + ", eta=" + eta + '}';
    }
    
 
    
    
}
