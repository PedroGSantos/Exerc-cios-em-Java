/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandométodosestáticos;

/**
 *
 * @author Pichau
 */
public class TestandoMétodosEstáticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConstruindoObjetos();
        DestruindoObjetos();
        estatico();
        NewClass teste = new NewClass();
        System.out.println("a velocidade do carro 1 é "+teste.velocidade);
    }
    
    public static void ConstruindoObjetos(){
        Veiculo carro1 = new Veiculo();
        Veiculo[] c = new Veiculo[2];
        c[0] = new Veiculo();
        c[0].velocidade = 7;
        c[1] = new Veiculo();
        c[1].velocidade = 5;
        
        System.out.println("a velocidade do carro na posição 1 é " + c[0].velocidade);
        System.out.println("a velocidade do carro na posição 2 é " + c[1].velocidade);
        
        carro1.velocidade = 5;
        System.out.println("a velocidade do carro 1 é " + carro1.velocidade);

        Veiculo carro2 = new Veiculo(22,70);
        System.out.println("a velocidade do carro 2 é " + carro2.velocidade + " e seu numero de serie " + carro2.numeroSerie);

        for (int i=0; i<10; i++){
            carro2.acelerar(70);
        }
        System.out.println("a velocidade do carro 2 é " + carro2.velocidade + " com a aceleração");
        }
    
    public static void DestruindoObjetos(){
        Veiculo carro1 = new Veiculo(22,70);
        Veiculo carro2 = new Veiculo(22,80);
        carro1 = carro2;
        carro2=null;
        System.out.println("a velocidade do carro 1 é " + carro1.velocidade);
        System.out.println("a velocidade do carro 2 é " + carro2.velocidade);
    }
    public static void estatico(){
        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = new Veiculo();
        carro1.Marca= "Chevrolet";
        System.out.println("A marca do carro 1" + carro1.Marca);
        System.out.println("A marca do carro 2" + carro2.Marca);
        System.out.println("A marca do carro 1" + Veiculo.MostraMarca());
    }
}
