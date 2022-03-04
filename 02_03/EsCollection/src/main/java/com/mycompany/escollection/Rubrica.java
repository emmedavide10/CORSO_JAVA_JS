/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escollection;


import java.util.*;

/**
 *
 * @author davide.mirra
 */
public class Rubrica {
    
    private List<Contatto> contatti;

    public Rubrica() {
    }

    public Rubrica(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    @Override
    public String toString() {
        return "Rubrica{" + "contatti=" + contatti + '}';
    }
    
    
    public void aggiungiContatto(String nome,String cognome,String telefono){
         List<Contatto> listContatti = getContatti();
         Contatto c = new Contatto(nome,cognome,telefono);
         listContatti.add(c);
    }
    
        public void rimuoviContatto(String nome,String cognome){
            List<Contatto> listContatti = getContatti();
            Iterator<Contatto> it = listContatti.iterator();
            //boolean rimosso = false;
            while(it.hasNext() /*&& !rimosso*/){
                Contatto c = it.next();
                if(c.getNome().equalsIgnoreCase(nome) && c.getCognome().equalsIgnoreCase(cognome)){
                    it.remove();
                    //rimosso = true;
                System.out.println(listContatti);
                }
            }
        }
        
        public String cercaContatto(String nome,String cognome){
             List<Contatto> listContatti = getContatti();
             for (Contatto c : listContatti) {
                if(c.getNome().equalsIgnoreCase(nome) && c.getCognome().equalsIgnoreCase(cognome)){
                    return c.getTelefono();
                }
            }
            return null;            
        }
}
