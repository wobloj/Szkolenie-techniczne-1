/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Wiktor
 */
public class proj {
    public static void main(String[] args){
        Prostokat p1 = new Prostokat();
        Prostokat p2 = new Prostokat(2,5);
        Figura f1 = new Figura(5);
        List<Figura> list= new ArrayList<Figura>(); 
        list.add(p1);
        list.add(p2);
        list.add(f1);
        
        for(Figura item : list){
            if(item.pole()<4)
                item.info();
        }
        
        f1.info();
        p2.info();

        System.out.println(f1.pole());
        System.out.println(p2.pole());
    }
}
