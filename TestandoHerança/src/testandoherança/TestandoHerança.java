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
public class TestandoHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma quad = new quadrado(5);
        System.out.println("A área do quadrado é " + quad.area());
        quad.setColor("Blue");
        System.out.println("A cor do quadrado é " + quad.getColor());
        Forma[] formas = new Forma[2]; 
        formas[0] = new quadrado(2);
        formas[1] = new circulo(3);
        formas[0].setColor("green");
        formas[1].setColor("red");
        formas[0].nome = "Quadrado";
        formas[1].nome = "Circulo";
        
        for(Forma f: formas){
            System.out.println("A cor do " + f.nome + " é " + f.getColor() + " e a area é " + f.area());
        }
    }
     
    
          
}

