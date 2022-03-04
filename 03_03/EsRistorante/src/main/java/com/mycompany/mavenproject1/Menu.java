/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;

/**
 *
 * @author davide.mirra
 */
public class Menu {
    private List<E> piatti;
    private List<E> bevande;

    public Menu() {
    }
    
    public Menu(List<E> piatti, List<E> bevande) {
        this.piatti = piatti;
        this.bevande = bevande;
    }   
    
    public List<E> getPiatti() {
        return piatti;
    }

    public List<E> getBevande() {
        return bevande;
    }

    public void setPiatti(List<E> piatti) {
        this.piatti = piatti;
    }

    public void setBevande(List<E> bevande) {
        this.bevande = bevande;
    }
    
    
    
    public void stampaPiatti(){
        System.out.println("ELENCO PIATTI");
        for (E e : piatti) {
            System.out.println(e.getNome()+"   "+e.getPrezzo());
        }
    }
    
    public void stampaBevande(){
        System.out.println("ELENCO BEVANDE");
        for (E e : bevande) {
            System.out.println(e.getNome()+"   "+e.getPrezzo());
        }
    }
    
}
