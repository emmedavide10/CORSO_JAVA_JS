/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;

/**
 *
 * @author davide.mirra
 */


public class Ellisse extends FiguraGeometrica{
    
    static double piGreco = Math.PI;
    
    private double semiAsseMagg;
    private double semiAsseMin;

    public Ellisse(double semiAsseMagg, double semiAsseMin, String descrizione) {
        super(descrizione);
        this.semiAsseMagg = semiAsseMagg;
        this.semiAsseMin = semiAsseMin;
    }
    
        public Ellisse(double semiAsseMagg,String descrizione) {
        super(descrizione);
        this.semiAsseMagg = semiAsseMagg;
    }
        
        public Ellisse(String descrizione) {
        super(descrizione);
    }

    public double getSemiAsseMagg() {
        return semiAsseMagg;
    }

    public void setSemiAsseMagg(double semiAsseMagg) {
        this.semiAsseMagg = semiAsseMagg;
    }

    public double getSemiAsseMin() {
        return semiAsseMin;
    }

    public void setSemiAsseMin(double semiAsseMin) {
        this.semiAsseMin = semiAsseMin;
    }
    
    @Override
    public double perimetro() {
        double sommaSemiAssi = Math.pow(getSemiAsseMagg(), 2)+Math.pow(getSemiAsseMin(),2);
        double perimetro = (piGreco*2)*Math.sqrt(sommaSemiAssi/2);
        return perimetro;
    }

    @Override
    public double area() {
        return piGreco*getSemiAsseMagg()*getSemiAsseMin();
    }

    @Override
    public String toString() {
        return "Ellisse{" + "perimetro=" + perimetro() + ", area=" + area() + '}';
    }

  
    
}
