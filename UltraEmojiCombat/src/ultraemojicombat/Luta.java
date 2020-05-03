
package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovado;
    private int rounds;

    public Luta(Lutador desafiante, Lutador desafiado){
        this.desafiante = desafiante;
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public void marcarLuta(){
        if (desafiado.getCategoria().equals(desafiante.getCategoria())){
            if (desafiado!=desafiante){
                aprovado = true;
            }
            else{
                desafiado = null;
                aprovado = false;
                desafiante = null;
            }
        }
    }
    
    public void lutar(){
        desafiado.apresentar();
        desafiante.apresentar();
        if(aprovado){
            Random num = new Random();
            int i = num.nextInt(3);
            switch(i){
                case 0:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                break;
                case 1:
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                break;
                case 2:
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;
                default:
                break;
            }
        }
        else{
            System.out.println("Não foi possível iniciar a luta, pois ela não está aprovada");
        }
    }
}
