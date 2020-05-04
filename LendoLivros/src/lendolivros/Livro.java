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
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public String detalhes(){
        return "Livro \nTítulo: " + this.titulo + "\nAutor: " + this.autor + "\nTotal de páginas: " + this.totPaginas +"\nPágina atual: " + this.pagAtual + "\n"
                + "Aberto: " + this.aberto + " \nLeitor: " + this.leitor.getNome();
    }

    @Override
    public void abrir() {
        aberto = true;
    }

    @Override
    public void fechar() {
        aberto = false;
    }

    @Override
    public void folhear(int pag) {
        this.pagAtual = pag;
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual()-1);
    }
}
