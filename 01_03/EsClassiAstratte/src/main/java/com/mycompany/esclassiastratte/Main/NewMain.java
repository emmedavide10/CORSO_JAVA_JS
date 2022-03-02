/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.esclassiastratte.Main;

import com.mycompany.esclassiastratte.Cerchio;
import com.mycompany.esclassiastratte.Ellisse;
import com.mycompany.esclassiastratte.Quadrato;
import com.mycompany.esclassiastratte.Rettangolo;
import com.mycompany.esclassiastratte.Triangolo;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import javax.swing.SwingConstants;

/**
 *
 * @author davide.mirra
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean finito = false;
        Scanner s = new Scanner(System.in);
        String figura = "";
        String risposta = "";

        
        while(finito == false){
            
            System.out.println("inserisci figura geometrica ");
            figura = s.nextLine();
            
            switch(figura){
                case "quadrato":
                    Quadrato q = new Quadrato(figura);
                    System.out.println("inserisci lato del quadrato: ");
                    double lato = s.nextDouble();
                    q.setAltezza(lato);
                    System.out.println(q.toString());
                    break;
                case "rettangolo":
                    Rettangolo r = new Rettangolo(figura);
                    System.out.println("inserisci base del rettangolo: ");
                    double base = s.nextDouble();
                    r.setBase(base);
                    System.out.println("inserisci altezza del rettangolo: ");
                    double altezza = s.nextDouble();
                    r.setAltezza(altezza);
                    System.out.println(r.toString());
                break;
                case "triangolo":
                    Triangolo t = new Triangolo(figura);
                    System.out.println("inserisci lato 1: ");
                    double lato1 = s.nextDouble();
                    System.out.println("inserisci lato 2: ");
                    double lato2 = s.nextDouble();
                    System.out.println("inserisci lato 3: ");
                    double lato3 = s.nextDouble();
                    t.setLati(lato1, lato2, lato3);
                    System.out.println(t.toString());
                break;
                case "cerchio":
                    Cerchio c = new Cerchio(figura);
                    System.out.println("inserisci raggio: ");
                    double raggio = s.nextDouble();
                    c.setSemiAsseMagg(raggio);
                    System.out.println(c.toString());
                    break;
                case "ellisse":
                    Ellisse e = new Ellisse(figura);
                    System.out.println("inserisci semi asse maggiore");
                    double semiAsseMagg = s.nextDouble();
                    System.out.println("inserisci semi asse minore");
                    double semiAsseMin = s.nextDouble();
                    e.setSemiAsseMagg(semiAsseMagg);
                    e.setSemiAsseMin(semiAsseMin);
                    System.out.println(e.toString());
                default:
                    System.out.println("figura non inserita corretamente: ");
                    break;
            } 
            
            System.out.println("vuoi uscire? (digitare si oppure no): ");
            risposta = s.next();
            if(risposta.equalsIgnoreCase("si")){
                finito = true;
                break;
            }
            else if(risposta.equalsIgnoreCase("no")){
                finito = false;
            }  
        }
    }    
}