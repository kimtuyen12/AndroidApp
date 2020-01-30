/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment0;

/**
 *
 * @author Tuyen Pham
 */
public class Triangle extends Shape{
    private double a,b,c;
    
    public Triangle (String name){
        super(name);
    }
    
    public void setDimension (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c =c;
    }
    
    public void printDimension(){
        System.out.println ("Side1: " + a + ", side2: " + b + ", side3 " + c);
    }
    
    @Override
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt((s)*(s-a)*(s-b)*(s-c));
    }
    
}
