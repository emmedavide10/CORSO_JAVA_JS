/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esamejava;

import java.util.List;

/**
 *
 * @author davide.mirra
 */
public class UniversitaAssociate extends Universita{
    private List<DocenteAssociato> docentiAssociati;

    public UniversitaAssociate(List<DocenteAssociato> docentiAssociati, List<Docente> docenti) {
        super(docenti);
        this.docentiAssociati = docentiAssociati;
    }
  
    
    
    //esercizio3
    public DocenteAssociato bestRicercatore(){
        
        DocenteAssociato bestDocenteAssociato = null;
        int votoMassimo = 0;
        for (int i = 0; i < docentiAssociati.size(); i++) {
            if (docentiAssociati.get(i).getVotoDiDottorato() > votoMassimo) {
                votoMassimo = docentiAssociati.get(i).getVotoDiDottorato();
                bestDocenteAssociato = docentiAssociati.get(i);
            } else if (docentiAssociati.get(i).getVotoDiDottorato() == votoMassimo) {
                if (docentiAssociati.get(i).getAnniContratti() > bestDocenteAssociato.getAnniContratti()) {
                    bestDocenteAssociato = docentiAssociati.get(i);
                } else if (docentiAssociati.get(i).getAnniContratti() == bestDocenteAssociato.getAnniContratti()) {
                    if (docentiAssociati.get(i).getEta() < bestDocenteAssociato.getEta()) {
                        bestDocenteAssociato = docentiAssociati.get(i);
                    }
                }
            }
        }
        return bestDocenteAssociato;
    }
       
}
    

