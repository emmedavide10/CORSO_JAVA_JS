/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Sia definita una classe Mobile che implementa l'interface
Articolo definita nell'esercizio precedente e rappresenta articoli per arredamento. La classe Mobile definisce
i metodi int getLarghezza(),int getAltezza() e int getProfondita() che restituiscono le dimensioni di un mobile.
Si scriva una classe ProvaMobile dotata di un metodo scegliMobile che riceve in ingresso un catalogo di
oggetti di tipo Mobile (o suoi sotto-tipi), un prezzo e tre dimensioni (larghezza, altezza, profondità) e
restituisce un lista di mobili il cui prezzo è inferiore al prezzo dato e le cui dimensioni sono inferiori alle
dimensioni date*/

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
        
        System.out.println(c.getArtSottoPrezzo(10));
        
        List<Mobile> mobili = new ArrayList<>();
        
        System.out.println("inserisci numero mobili: ");
        int x = s.nextInt();
        
        for (int i = 0; i < x; i++) {
           Mobile m = new Mobile();
           m.setAltezza(i);
           m.setLarghezza(i);
           m.setProfondita(i);
           m.setPrezzo(i);
           m.setNome("nome"+i);
           mobili.add(m);
        }
        
        List<Mobile> mobiliCheck = ProvaMobile.scegliMobile(mobili, 4, 4, 4, 4);
        for (Mobile mobile : mobiliCheck) {
            System.out.println(mobile.getNome()+ " "+mobile.getAltezza()+ " "+mobile.getLarghezza()+ " "+mobile.getPrezzo()+ " "+mobile.getProfondita());
        }
    }
    
}
