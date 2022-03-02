/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;

/**
 *
 * @author davide.mirra
 */
public class Rettangolo extends FiguraGeometrica{
   
   private double base;
    
   private double altezza;

    public Rettangolo(double base, double altezza, String descrizione) {
        super(descrizione);
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(double base, String descrizione) {
        super(descrizione);
        this.base = base;
    }

    public Rettangolo(String descrizione) {
        super(descrizione);
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return getBase()*getAltezza();
    }
    
    @Override
    public double perimetro() {
        return (getBase()*2)+(getAltezza()*2);
    }
    
    @Override
    public String toString() {
        return "Rettangolo{" + "perimetro=" + perimetro() + ", area=" + area() + '}';
    }


    
   
   
}
