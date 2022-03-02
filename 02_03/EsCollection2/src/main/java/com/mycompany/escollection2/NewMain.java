/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.escollection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author davide.mirra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Catalogo c = new Catalogo();
        List<Articolo> articoli = new ArrayList<>();
        
        System.out.println("inserisci numero articoli del catalogo: ");
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            Articolo a = new Articolo();
            a.setNome("nome"+i);
            a.setPrezzo(i);
            articoli.add(a);            
        }
        
        c.setArticoli(articoli);
        
        Articolo a = new Articolo("adasda",20.50);
        c.aggiungiArticolo(a);
        
        c.getArtSottoPrezzo(10);
    }
    
}
