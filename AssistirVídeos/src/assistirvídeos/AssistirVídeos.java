/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistirvídeos;

/**
 *
 * @author Pichau
 */
public class AssistirVídeos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gafanhoto esp = new Gafanhoto("Pedro", 19, 'M', "pedrin");
       Video filme = new Video("Matrix");
       filme.play();
       filme.like();
       esp.ganharExp();
       Visualizacao v = new Visualizacao(esp, filme);
       v.avaliar(8);
       System.out.println(v.status());
       System.out.println(esp.getExperiencia());
    }
    
}
