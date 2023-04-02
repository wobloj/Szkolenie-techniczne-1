/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Wiktor
 */
public class Figura {
    private double a;
    
    public Figura(double a){
        this.a = a;
    }
    public Figura(){
        a=0;
    }
    
    
    public void info(){
        System.out.println("Figura");
    }
    public double pole(){
        return a;
    }
}
