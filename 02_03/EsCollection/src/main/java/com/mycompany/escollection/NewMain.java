/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.escollection;

import java.util.*;

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
        Rubrica r = new Rubrica();
        List<Contatto> contatti = new ArrayList<>();
        
        System.out.println("inserisci numeri contatti in rubrica: ");
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            Contatto c = new Contatto();
            c.setNome("NOME"+i);
            c.setCognome("COGNOME"+i);
            c.setTelefono("TELEFONO"+i);
            contatti.add(c);            
        }
        r.setContatti(contatti);
        
        System.out.println(r);
        
      
        r.aggiungiContatto("DAVIDE", "MIRRA", "32853985598");
        r.aggiungiContatto("ASDASD", "MIRAFGRA", "32800005598");
        r.aggiungiContatto("DFGDVIDE", "MIRRSRFDFDA", "32885598");
        
        r.rimuoviContatto("DAVIDE", "MIRRA");
        r.rimuoviContatto("DFGDVIDE", "MIRRSRFDFDA");
        
        r.cercaContatto("ASDASD", "MIRAFGRA");
        
        System.out.println(r);

    }
    
}
