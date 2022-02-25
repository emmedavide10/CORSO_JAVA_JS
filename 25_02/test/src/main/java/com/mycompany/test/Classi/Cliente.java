/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.Classi;

/**
 *
 * @author davide.mirra
 */
public class Cliente {
    
    private String nome;
    private String residenza;

    public Cliente(String nome, String residenza) {
        this.nome = nome;
        this.residenza = residenza;
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

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", residenza=" + residenza + '}';
    }
    
    
    
}
