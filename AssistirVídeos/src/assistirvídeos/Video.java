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
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private int mediaAvaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        avaliacao=0;
        views=0;
        curtidas=0;
        reproduzindo=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int totalAvaliacao;
        totalAvaliacao = this.avaliacao + avaliacao;
        mediaAvaliacao = (int) totalAvaliacao/views;
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        reproduzindo = true;
    }

    @Override
    public void pause() {
        reproduzindo = false;
    }

    @Override
    public void like() {
        curtidas++;
    }
    
}
