/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;

/**
 *
 * @author davide.mirra
 */
public abstract class FiguraGeometrica {
    
    private String descrizione;
    
    
    public FiguraGeometrica(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "descrizione=" + descrizione + '}';
    }
    
    

    
}
