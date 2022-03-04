/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.*;
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
        
        int scelta = 0;
        String nomeBevanda = "";
        String nomePiatto = "";
        Scanner s = new Scanner(System.in);
        
        List<E> piatti = new ArrayList<>();
        for (int i = 0; i < 5; i++) {           
            E piatto = new E("piatto"+i,generateRandomNumber());
            piatti.add(piatto);
        }
        
        List<E> bevande = new ArrayList<>();
        for (int i = 0; i < 5; i++) {           
            E bevanda = new E("bevanda"+i,generateRandomNumber());
            bevande.add(bevanda);
        }
        
        Menu menu = new Menu(piatti,bevande);
        Tavolo tavolo = new Tavolo(1,5);
        menu.stampaBevande();
        menu.stampaPiatti();
        
        System.out.println("1) bevande \n"+"2) piatti \n"+"3) conto");
        do{
            System.out.println("digitare: ");
            scelta = s.nextInt();
            if(scelta!=0 || scelta !=3){
                if(scelta == 1){
                    System.out.println("scegliere bevanda: ");
                    nomeBevanda = s.next();                    for (E bevanda : bevande) {
                        if(nomeBevanda.equalsIgnoreCase(bevanda.getNome())){
                            tavolo.inserimento(bevanda);
                        }
                    }
                }else if(scelta == 2){
                    System.out.println("scegliere piatto: ");
                    nomePiatto = s.next();
                        for (E piatto : piatti) {
                            if(nomePiatto.equalsIgnoreCase(piatto.getNome())){
                                tavolo.inserimento(piatto);
                            }
                        }
                }
            }
        }while(scelta!=3);
        
        double conto = arrotonda(tavolo.calcolaConto());
        System.out.println("conto: "+conto);
        
        
    }
    
    private static double generateRandomNumber(){
        int max = 20;
        int min = 1;
        int range = max - min + 1;
        double random = (double)(Math.random() * range) + min;
        double prezzo = arrotonda(random);
        return prezzo;
    }
    
    private static double arrotonda(double n){
        return Math.round(n*100.0)/100.0;
    }
}
