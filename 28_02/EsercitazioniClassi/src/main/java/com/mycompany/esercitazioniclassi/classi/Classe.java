/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercitazioniclassi.classi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davide.mirra
 */
public class Classe {
 
    private String nome;
    private Scuola scuola;
    private List<Insegnante> insegnanti;
    private int numAlunni;

    public Classe(String nome, Scuola scuola, int numAlunni) {
        this.nome = nome;
        this.scuola = scuola;
        this.numAlunni = numAlunni;
    }

    public Classe(String nome, Scuola scuola, List<Insegnante> insegnanti, int numAlunni) {
        this.nome = nome;
        this.scuola = scuola;
        this.insegnanti = insegnanti;
        this.numAlunni = numAlunni;
    }

    public Classe() {
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Scuola getScuola() {
        return scuola;
    }

    public void setScuola(Scuola scuola) {
        this.scuola = scuola;
    }

    public List<Insegnante> getInsegnanti() {
        return insegnanti;
    }

    public void setInsegnanti(List<Insegnante> insegnanti) {
        this.insegnanti = insegnanti;
    }

    public int getNumAlunni() {
        return numAlunni;
    }

    public void setNumAlunni(int numAlunni) {
        this.numAlunni = numAlunni;
    }

    @Override
    public String toString() {
        return "Classe{" + "nome=" + nome + ", scuola=" + scuola + ", insegnanti=" + insegnanti + ", numAlunni=" + numAlunni + '}';
    }
    
    public List<Insegnante> inserisciInsegnante(Insegnante i,int posizione){
        
        List<Insegnante> insegnanti = new ArrayList<>();
        insegnanti.add(posizione,i);
        return insegnanti;
                
    }

    
    
}
