/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davide.mirra
 */
public class Tavolo {
    
    private int numero;
    private int nCoperti;
    private List<E> ordinazione = new ArrayList<>();
    
    
    public Tavolo() {
    }

    public Tavolo(int numero, int nCoperti) {
        this.numero = numero;
        this.nCoperti = nCoperti;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getnCoperti() {
        return nCoperti;
    }

    public void setnCoperti(int nCoperti) {
        this.nCoperti = nCoperti;
    }

    public List<E> getOrdinazione() {
        return ordinazione;
    }

    public void setOrdinazione(List<E> ordinazione) {
        this.ordinazione = ordinazione;
    }
    
    
    public void inserimento(E e){
        if(e.getPrezzo()!=0) ordinazione.add(e);
    }
    
    public double calcolaConto(){
        double conto = 0;
        for (int i = 0; i < ordinazione.size(); i++) {
            conto+=ordinazione.get(i).getPrezzo();            
        }
        return conto;
    }
    


    @Override
    public String toString() {
        
        return "Tavolo{" + "numero=" + numero + ", nCoperti=" + nCoperti + ", ordinazione=" + ordinazione + '}';
    }

    
    
}
