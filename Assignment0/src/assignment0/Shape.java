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

import java.util.*;

public class Shape {
    private String name;
    
    public Shape (String name){
        this.name = name;
    }
    
    /**return the name of the shape*/
    public String getName(){
        return name;
    }
    
    /**return the area of the shape*/
    public double getArea(){
        return 0.0;
    }
    
    public void printDimensions(){
        System.out.println("No dimensions");
    }
}
