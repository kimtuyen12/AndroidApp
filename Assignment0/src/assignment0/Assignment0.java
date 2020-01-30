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

import java.util.Scanner;

public class Assignment0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        //creating all objects
        System.out.println("Enter length and height for Square :");
        Square square=new Square("Square");
        square.setDimension(sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter radius for Circle :");
        Circle circle=new Circle("Circle");
        circle.setDimension(sc.nextDouble());
        System.out.println("Enter a, b and c for Triangle :");
        Triangle triangle=new Triangle("Triangle");
        triangle.setDimension(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter side for EquilateralTriangle :");
        EquilateralTriangle equilateraltriangle=new EquilateralTriangle("EquilateralTriangle");
        equilateraltriangle.setDimension(sc.nextDouble());

        //print all objects
        System.out.println("\n"+square.getName());
        square.printDimension();
        System.out.println("Area: "+square.getArea());
        System.out.println("\n"+circle.getName());
        circle.printDimension();
        System.out.println("Area: "+circle.getArea());
        System.out.println("\n"+triangle.getName());
        triangle.printDimension();
        System.out.println("Area: "+triangle.getArea());
        System.out.println("\n"+equilateraltriangle.getName());
        equilateraltriangle.printDimension();
        System.out.println("Area: "+equilateraltriangle.getArea());
    }
    
}
