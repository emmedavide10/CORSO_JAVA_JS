/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.figuregeometriche;

import java.util.Scanner;

/**
 *
 * @author davide.mirra
 */
public class Rettangolo {
    private float base;
    private float altezza;


    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }
    
    private float calcolaPerimetro(float altezza,float base){
        return (base*2)+(altezza*2);
    }
    
    private float calcolaArea(float altezza,float base){
        return base*altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" + "Area=" + calcolaArea(altezza, base) + ", Perimetro=" + calcolaPerimetro(altezza, base) + '}';
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rettangolo r = new Rettangolo();
        System.out.println("inserire base rettangolo: ");
        float base = scanner.nextFloat();
        r.setBase(base);
        System.out.println("inserire altezza rettangolo: ");
        float altezza = scanner.nextFloat();
        r.setAltezza(altezza);
        System.out.println(r.toString());
    }
}
