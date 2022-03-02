/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escollection2;

/**
 *
 * @author davide.mirra
 */
public class Mobile implements ArticoloInterface{

    private String nome;
    private double prezzo;
    private double larghezza;
    private double altezza;
    private double profondita;

    public Mobile() {
    }

    public Mobile(String nome, double prezzo, double larghezza, double altezza, double profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
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

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    
    
}
