/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import com.mycompany.test.Classi.Cliente;
import com.mycompany.test.Classi.Persona;

/**
 *
 * @author davide.mirra
 */
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("MASTER","OLIMPO","UNDEFINED");
        Cliente c = new Cliente("TUTTI GLI ALTRI","CASA LORO");
        System.out.println(p.toString());
        System.out.println(c.toString());
    }
}
