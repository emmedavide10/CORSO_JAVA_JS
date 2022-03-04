/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esamejava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davide.mirra
 */
public class Universita {
    
    private List <Docente> docenti;

    public Universita(List<Docente> docenti) {
        this.docenti = docenti;
    }

    public List<Docente> getDocenti() {
        return docenti;
    }

    public void setDocenti(List<Docente> docenti) {
        this.docenti = docenti;
    }
    
    

//esercizio1    
    public int getEtaMinima(){
        int etaMinima = 0;
        for (int i = 0; i < docenti.size(); i++) {
            int eta = docenti.get(i).getEta();
            if(eta<etaMinima){
                etaMinima=eta;
            }
        }
        return etaMinima;
    }
    
    //esercizio2
    public List<String> trovaGiovani(){
        List<String> cognomi = new ArrayList<>();
        int eta = 0;
        for (Docente docente : docenti) {
            eta = docente.getEta();
            if(eta == getEtaMinima()){
                cognomi.add(docente.getCognome());
            }
        }
        return cognomi;
    }
}
