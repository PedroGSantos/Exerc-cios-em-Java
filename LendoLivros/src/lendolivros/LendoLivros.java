/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendolivros;

/**
 *
 * @author Pichau
 */
public class LendoLivros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa("Pedro", 19, 'M');
        Livro l1 = new Livro("O menino que roubava livros", "Emerson", 300, p1);
        l1.abrir();
        l1.folhear(9);
        l1.avancarPag();
        System.out.println(l1.detalhes());
        
    }
    
}
