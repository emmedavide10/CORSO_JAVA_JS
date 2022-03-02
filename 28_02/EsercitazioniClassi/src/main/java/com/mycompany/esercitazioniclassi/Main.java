/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esercitazioniclassi;

import com.mycompany.esercitazioniclassi.classi.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author davide.mirra
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Scuola scuola = new Scuola("PACINOTTI", "VIA GENNARO PASQUARIELLO", "scuola secondaria di secondo grado");
        Insegnante insegnante = new Insegnante("GENNARO","DONATO",scuola);
        Classe classe = new Classe();
        List<Insegnante> insegnanti = classe.inserisciInsegnante(insegnante,1);
        classe.setNome("V A");
        classe.setNumAlunni(20);
        classe.setInsegnanti(insegnanti);
    }
    


    
}
