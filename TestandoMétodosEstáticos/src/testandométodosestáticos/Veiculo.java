/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandométodosestáticos;

/**
 *
 * @author Pichau
 */
public class Veiculo {
    static String Marca;
    int velocidade;
    int numeroSerie;
    
    static String MostraMarca(){
       return "A marca é " + Marca; 
    }
    Veiculo (){
        velocidade --;
    }
    Veiculo (int numSerie, int vel){
        velocidade = vel;
        numeroSerie = numSerie;
    }
    void frear(){
        velocidade -= velocidade;
    }
    
    void acelerar(int vel){
        velocidade = vel + 1;
    }
    
    void parar(){
        while(velocidade > 0){
            velocidade -= velocidade;
        }
       velocidade = 0;
    }
}
