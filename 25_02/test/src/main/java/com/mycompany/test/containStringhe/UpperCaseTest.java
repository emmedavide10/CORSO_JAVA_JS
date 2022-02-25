/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.test.containStringhe;

import javax.swing.JOptionPane;

/**
 *
 * @author davide.mirra
 */
public class UpperCaseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String stringaNuova="";
        String posString = "";
        String str1=JOptionPane.showInputDialog("Dammi la stringa");
        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            posString = String.valueOf(str1.charAt(i));
            if(i%2==0) stringaNuova+=posString.toUpperCase();
                else stringaNuova+=posString;
        }
        JOptionPane.showMessageDialog(null, stringaNuova);
    }
}
