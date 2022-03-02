/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escollection2;

/**
 *
 * @author davide.mirra
 */
public class Articolo implements ArticoloInterface{
    
    private String nome;
    private double prezzo;

    public Articolo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Articolo() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString(String titolo, double prezzo) {
        return "Articolo{" + "titolo=" + titolo + ", prezzo=" + prezzo + '}';
    }
    
    
    
}
