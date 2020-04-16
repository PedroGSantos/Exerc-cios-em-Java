/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloword;

/**
 *
 * @author Pichau
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String exibe;
       Boolean flag=true;
       exibe = "Hello Word";
       System.out.print(exibe);
       if (flag){
           System.out.print(exibe);
       }
       else{
           System.out.print("Falso");
       }
       System.out.print(5/2);
       System.out.print(5.0/2);
       if (5>2 && 5<6) {
           System.out.print(flag);
       }
    }
    
}
