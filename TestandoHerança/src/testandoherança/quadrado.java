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
public class quadrado extends Forma {
    protected double l;
    
    public quadrado(double l){
        this.l = l;
    }
    @Override
    public double area(){
        return Math.pow(l,2);
    }
}
