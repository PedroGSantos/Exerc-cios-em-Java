/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Pichau
 */
public class UltraEmojiCombat {

    public static void main(String[] args) {
      Lutador[] lutadores = new Lutador[5];
      
      lutadores[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
      
      lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
      
      lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
      
      lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
    
      lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
      
      
      Luta fight = new Luta(lutadores[2],lutadores[1]);
      
      fight.marcarLuta();
      fight.lutar();
      lutadores[0].status();
      lutadores[1].status();
      
    }
    
}
