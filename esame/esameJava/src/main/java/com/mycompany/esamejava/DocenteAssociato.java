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
public class DocenteAssociato extends Docente{
    private int votoDiDottorato;
    private List <Contratto> contratti;

    public DocenteAssociato(int votoDiDottorato, List<Contratto> contratti, String nome, String cognome, String codice, int eta) {
        super(nome, cognome, codice, eta);
        this.votoDiDottorato = votoDiDottorato;
        this.contratti = contratti;
    }

    
    
    public int getVotoDiDottorato() {
        return votoDiDottorato;
    }

    public void setVotoDiDottorato(int votoDiDottorato) {
        this.votoDiDottorato = votoDiDottorato;
    }

    public List<Contratto> getContratti() {
        return contratti;
    }

    public void setContratti(List<Contratto> contratti) {
        this.contratti = contratti;
    }
    
    public int getAnniContratti() {
        int anni = 0;
        for (int i = 0; i < contratti.size(); i++) {
            anni += contratti.get(i).getDurataContrattoLavoro();
        }
        return anni;
    }
}
