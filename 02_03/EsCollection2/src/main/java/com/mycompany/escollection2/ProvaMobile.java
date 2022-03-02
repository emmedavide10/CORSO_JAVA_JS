/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escollection2;

import java.util.*;

/**
 *
 * @author davide.mirra
 */
public class ProvaMobile {
    
    public static List<Mobile> scegliMobile(List<Mobile> mobili,double prezzo,double larghezza,double altezza,double profondita){
        Iterator<Mobile> it = mobili.iterator();
        
        while(it.hasNext()) {
            Mobile m = it.next();
            if(m.getPrezzo()>prezzo && m.getLarghezza()>larghezza && m.getAltezza()> altezza && m.getProfondita()>profondita){
                it.remove();
            }
        }
        return mobili;
    }
}
