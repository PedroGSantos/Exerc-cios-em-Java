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
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        filme.setReproduzindo(true);
        filme.setViews(filme.getViews() + 1 );
        espectador.viuMaisUm();
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
       filme.setAvaliacao(Integer.parseInt(String.valueOf(porc)));
    }
    
    public String status(){
        return "O usuário " + espectador.getNome() + " assistiu o filme " + filme.getTitulo() + ", é o seu " + espectador.getTotAssistido() + "º filme assistido. Sua avaliação foi " +  filme.getAvaliacao();
    }
}
