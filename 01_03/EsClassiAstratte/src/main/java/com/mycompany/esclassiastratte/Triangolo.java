/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;

import java.util.ArrayList;

/**
 *
 * @author davide.mirra
 */
public class Triangolo extends FiguraGeometrica{
    

    double[] lati = new double[3];

    public Triangolo(String descrizione,double lato1,double lato2,double lato3) {
        super(descrizione);
        lati[0] = lato1;
        lati[1] = lato2;
        lati[3] = lato3;
    }

    public double[] getLati() {
        return lati;
    }

    public void setLati(double lato1,double lato2,double lato3) {
        this.lati[0] = lato1;
        this.lati[1] = lato2;
        this.lati[2] = lato3;
    }
 
        public Triangolo(String descrizione) {
        super(descrizione);
    }
    
    @Override
    public String toString() {
        return "Traingolo{" + "perimetro=" + perimetro() + ", area=" + area() + '}';
    }

    
    @Override
    public double area() {
        double [] lati = getLati();
        double perimetro = perimetro();
        double area = Math.sqrt(perimetro*(perimetro-lati[0]*lati[1])*(perimetro-lati[1]*lati[2])*(perimetro-lati[0]*lati[2]));
        return area;
    }

    @Override
    public double perimetro() {
        double [] lati = getLati();
        return lati[0]+lati[1]+lati[2];
    }
    
    
}
