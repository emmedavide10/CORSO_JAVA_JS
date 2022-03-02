/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;
import java.math.*;
/**
 *
 * @author davide.mirra
 */
public class Cerchio extends Ellisse{
    
    static double piGreco = Math.PI;
    
    public Cerchio(double semiAsseMagg,String descrizione){
        super(semiAsseMagg, descrizione);
    }

    public Cerchio(String descrizione) {
        super(descrizione);
    }

    
    @Override
    public void setSemiAsseMagg(double semiAsseMagg) {
        super.setSemiAsseMagg(semiAsseMagg); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getSemiAsseMagg() {
        return super.getSemiAsseMagg(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public double perimetro() {
        double perimetro = (piGreco*2)*getSemiAsseMagg();
        return perimetro;
    }
    
    
    @Override
    public double area() {
        double raggioAlQuad = Math.pow(getSemiAsseMagg(),2);
        return piGreco*raggioAlQuad;
    }
    
    @Override
    public String toString() {
        return "Cerchio{" + "perimetro=" + perimetro() + ", area=" + area() + '}';
    }




    
    
}
