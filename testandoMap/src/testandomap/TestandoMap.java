/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Pichau
 */
public class TestandoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map <String, Integer> m = new HashMap<>();
        m.put("Matrix", 10);
        m.put("Guerra Mundial Z", 5);
        System.out.println(m.containsValue(10)); //true
        for (Entry<String, Integer> mapa: m.entrySet()){
            System.out.println("Filme: " + mapa.getKey() + " Nota: " + mapa.getValue());
        }
    }
    
}
