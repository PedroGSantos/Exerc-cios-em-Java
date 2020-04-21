/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandointerfaces;

/**
 *
 * @author Pichau
 */
public class TestandoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //implementando interface numa classe comum
        roda r = new roda();
        r.getVelocidade(5);
        r.MostrarPecas();
        veiculo teste = new veiculo();
        //implementando classe anonima a partir de interface
        teste.coletar(new carro() {
            @Override
            public void getVelocidade(double vel) {
                System.out.println("Oi " + (vel - 40));
            }
        }, 80);
    }
   
    
}
interface carro{
    
    public void getVelocidade(double vel);
}

class roda implements carro{
    
    double v;
    
    //implementando classes aninhadas    
    class peças{

        double numeroPecas(double v){
            return v + 50;
        }
        
    }
    
    public void MostrarPecas(){
      peças p = new peças();
      System.out.println(p.numeroPecas(v));
    }
   
    @Override
    public void getVelocidade(double vel){
        v = vel;
        System.out.println("Olha a velocidade" + v);
        
    }
}

class veiculo {
    
    public void coletar(carro colvel, double ve){
       colvel.getVelocidade(ve);
    }
}