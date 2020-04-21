/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandolistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichau
 */
public class TestandoListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Integer> numeroPares = new ArrayList<Integer>();
        int ale = (int) (Math.random() * 100);
        for (int i=0; i < ale; i++){
            numeroPares.add(i*2);
        }
        for (int exibe: numeroPares){
            System.out.println(exibe);
        }
    }
    
}
