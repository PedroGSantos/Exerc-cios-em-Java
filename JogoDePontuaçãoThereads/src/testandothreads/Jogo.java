/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandothreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pichau
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jogadores play1 = new jogadores("Pedro", 50);
        jogadores play2 = new jogadores("Rubens", 10);
        play1.start();
        play2.start();
        
    }
           
}
class jogadores extends Thread{
    private String name;
    private double score;
    private long delay=20;

 
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
    
    jogadores(String name, double score){
        this.name = name;
        this.score = score; 
    }
    public void run(){
        for (int i=0; i<=10000; i++){
           System.out.println("O jogador " + name + " tem essa pontuação: " + (score + Math.random() * 100));
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(jogadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  
