/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.test.containStringhe;

import javax.swing.*;

/**
 *
 * @author davide.mirra
 */
public class ContainsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String str1=JOptionPane.showInputDialog("Dammi prima stringa");
        String str2=JOptionPane.showInputDialog("Dammi seconda stringa");
        if(str1.contains(str2)){
            JOptionPane.showMessageDialog(null, "la stringa: "+str1+" continene la stringa: "+str2);
        }else if(str2.contains(str1)){
            JOptionPane.showMessageDialog(null, "la stringa: "+str2+" continene la stringa: "+str1);
        }else{
            JOptionPane.showMessageDialog(null, "la stringa: "+str1+" continene la stringa: "+str2);
        }
    }
}
