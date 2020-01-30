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
public class Square extends Shape {
    private double length;
    private double height;
    
    public Square (String name){
        super(name);
    }
    
    public void setDimension (double length, double height){
        this.length = length;
        this.height = height;
    }
    
    
    public void printDimension(){
        System.out.println ("Length: " + length + " &Height: " + height);
    }
    
    @Override
    public double getArea(){
        return length * height;
    }
}
