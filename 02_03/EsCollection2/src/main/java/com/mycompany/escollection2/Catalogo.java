/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escollection2;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author davide.mirra
 */
public class Catalogo {

    private List<Articolo> articoli;

    public Catalogo() {
    }

    public Catalogo(List<Articolo> articoli) {
        this.articoli = articoli;
    }

    public List<Articolo> getArticoli() {
        return articoli;
    }

    public void setArticoli(List<Articolo> articoli) {
        this.articoli = articoli;
    }
    
    public void aggiungiArticolo(Articolo art){
        this.articoli.add(art);
    }    
    
    public List<Articolo> getArtSottoPrezzo(double prezzo){
        
        List <Articolo> articoliList = this.articoli;
        Iterator<Articolo> it = articoliList.iterator();
        
        while(it.hasNext()) {
            Articolo a = it.next();
            if(a.getPrezzo()>prezzo){
                it.remove();
            }
        }
        return articoliList;
    }  

    @Override
    public String toString() {
        return "Catalogo{" + "articoli=" + articoli + '}';
    }
    
    
}
