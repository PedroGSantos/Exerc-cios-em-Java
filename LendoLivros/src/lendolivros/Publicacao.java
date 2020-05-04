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
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int pag);
    public void avancarPag();
    public void voltarPag();
}
