/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author davide.mirra
 */
public class E {
    
    private String nome;
    private double prezzo;
    

    public E(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public E() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "{" + "nome=" + nome + ", prezzo=" + prezzo + '}';
    }   
    
}
