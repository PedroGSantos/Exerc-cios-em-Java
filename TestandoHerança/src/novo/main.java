/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo;
import testandoherança.quadrado;
import testandoherança.Forma;
/**
 *
 * @author Pichau
 */
public class main {
    public static void main(String[] args) {
        Forma qua = new quadrado(5);
        System.out.println("O resultado da area do quadrado é: " + qua.area());
    }
}
