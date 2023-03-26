/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author Wiktor
 */
public class Prostokat extends Figura{
    private double a,b;
    
    public Prostokat(double a,double b){
        this.a = a;
        this.b = b;
    }
    public Prostokat(){
        a = 0;
        b = 0;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    @Override
    public void info(){
        System.out.println("Prostokat; wartość a = "+getA()+", a wartość b = "+getB());
    }
    @Override
    public double pole(){
        return a*b;
    }
    
    
}
