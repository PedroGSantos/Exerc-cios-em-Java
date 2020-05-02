/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco conta = new ContaBanco();
        Scanner entrada = new Scanner(System.in);
        byte resp;
        int numConta;
        float deposit, value;
        String tipo, dono;
        do{
            System.out.println("Bem vindo ao banco BBB");
            System.out.println("Digite [1] para abrir uma conta");
            System.out.println("Digite [2] para fechar uma conta");
            System.out.println("Digite [3] para depositar na conta");
            System.out.println("Digite [4] para sacar na conta");
            System.out.println("Digite [5] para realizar o pagamento mensal uma conta");
            System.out.println("Digite [6] para mostrar o status da sua conta");
            System.out.println("Digite [7] para fechar o sistema");
            resp = entrada.nextByte();
            switch (resp){
                case 1:
                    System.out.println("Digite o número da sua conta (no mínimo 5 números): "); 
                    numConta = entrada.nextInt();
                    System.out.println("Digite o tipo da sua conta (CC = Conta concorrente; CP = Conta poupança): "); 
                    tipo = entrada.next();
                    System.out.println("Digite seu nome: "); 
                    dono = entrada.next();
                    conta.abrirConta(numConta, tipo, dono);
                break;
                case 2:
                    conta.fecharConta();
                break;
                case 3:
                    System.out.println("Digite o valor que você vai depositar: ");
                    deposit = entrada.nextFloat();
                    conta.depositar(deposit);
                break;
                case 4:
                    System.out.println("Digite o valor que você quer sacar: ");
                    value = entrada.nextFloat();
                    System.out.println("Você realizou um saque de: R$" + conta.sacar(value));
                break;
                case 5:
                    conta.pagarMensal();
                break;
                case 6:
                    System.out.println("O dono da conta é: " + conta.getDono());
                    System.out.println("O número da conta é: " + conta.getNumConta());
                    System.out.println("O saldo da conta é: " + conta.getSaldo());
                    System.out.println("O tipo da conta é: " + conta.getTipo());
                    System.out.println("O status da conta é: " + conta.getStatus());
                break;
                case 7:
                    System.out.println("Estou encerrando");
                break;    
                default:
                    System.out.println("Você digitou um número que não corresponde");            
            }
        }while (resp!=7);
    }
    
}
