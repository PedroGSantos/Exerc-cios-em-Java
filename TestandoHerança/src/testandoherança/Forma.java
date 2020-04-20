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
public abstract class Forma {
      String color;
    String nome;
        
    void setColor(String color){
        this.color = color;
    }
        
    String getColor() {
        return color;
    }
    
    public abstract double area();
}
