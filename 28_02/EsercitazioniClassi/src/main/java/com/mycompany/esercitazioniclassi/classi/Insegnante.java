/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercitazioniclassi.classi;

/**
 *
 * @author davide.mirra
 */
public class Insegnante {
    
    private String nome;
    private String cognome;
    private Scuola scuola;

    public Insegnante(String nome, String cognome, Scuola scuola) {
        this.nome = nome;
        this.cognome = cognome;
        this.scuola = scuola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Scuola getScuola() {
        return scuola;
    }

    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }

    @Override
    public String toString() {
        return "Insegnante{" + "nome=" + nome + ", cognome=" + cognome + ", scuola=" + scuola + '}';
    }
    
    
}
