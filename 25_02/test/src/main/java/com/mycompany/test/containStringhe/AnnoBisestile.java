/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.containStringhe;

import javax.swing.JOptionPane;

/**
 *
 * @author davide.mirra
 */
public class AnnoBisestile {
    public static void main(String[] args) {
        String anno =JOptionPane.showInputDialog("inserisci anno");
        int annoInt = Integer.parseInt(anno);
        if ((annoInt % 400 == 0) || (annoInt %4 == 0 && annoInt % 100 != 0)){
            JOptionPane.showMessageDialog(null, "l'anno inserito è bisestile");
        }else{
            JOptionPane.showMessageDialog(null, "l'anno inserito NON è bisestile");
        }
    }
}
