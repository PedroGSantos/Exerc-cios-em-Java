/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoherança;

/**
 *
 * @author Pichau
 */
public class circulo extends Forma {
    protected double r;
      
    public circulo(double r){
        this.r = r;
    }
    
    @Override
    public double area(){
        return Math.PI * Math.pow(r,2);
    }
}
