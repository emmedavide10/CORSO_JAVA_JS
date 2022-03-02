/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esclassiastratte;

import static java.lang.Math.*;

/**
 *
 * @author davide.mirra
 */
public class Quadrato extends Rettangolo{
    
    public Quadrato(double lato, String descrizione) {
        super(lato, descrizione);
    }

    public Quadrato(String descrizione) {
        super(descrizione);
    }


    @Override
    public void setAltezza(double altezza) {
        super.setAltezza(altezza); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getAltezza() {
        return super.getAltezza(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double perimetro() {
        return getAltezza()*4;
    }

    @Override
    public double area() {
        return Math.pow(getAltezza(),2); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public String toString() {
        return "Quadrato{" + "perimetro=" + perimetro() + ", area=" + area() + '}';
    }
    
    
}
