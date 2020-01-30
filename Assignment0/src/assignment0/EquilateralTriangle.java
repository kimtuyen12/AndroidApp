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

public class EquilateralTriangle extends Triangle {
    private double s1;
    
    public EquilateralTriangle (String name){
        super(name);
    }
    
    public void setDimension (double s1){
        super.setDimension(s1,s1,s1);
        this.s1 = s1;
    }
}
