/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Pichau
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status=false;

    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(int numConta, String tipo, String dono){
        if (numConta!=0){
            switch (tipo) {
                case "CC":
                    setSaldo(100.0f);
                    System.out.println("Sua conta foi criada com sucesso");
                    setDono(dono);
                    setNumConta(numConta);
                    setStatus(true);
                    break;
                case "CP":
                    setSaldo(150.0f);
                    System.out.println("Sua conta foi criada com sucesso");
                    setDono(dono);
                    setNumConta(numConta);
                    setStatus(true);
                    break;
                default:
                    System.out.println("Você digitou um tipo de conta inválida, abra uma conta novamente");
                    break;
            }
        }else{
            System.out.println("Você não digitou um número de conta válido, abra uma conta novamente");
        }
    }
    public void fecharConta(){
        if(status==true){
            if(saldo<0){
                System.out.println("Não foi possível fechar a conta, pois seu saldo é negativo");
            }
            else if (saldo>0){
                System.out.println("Não foi possível fechar a conta, pois ainda há dinheiro na sua conta");
            }
            else{
                System.out.println("Sua conta foi fechada");
                setStatus(false);
            }
        }else{
            System.out.println("Não existe conta para ser fechada"); 
        }
    }
    
    public void depositar(float deposit){
        if(status==true){
            setSaldo(deposit);
            System.out.println("O dinheiro foi depositado com sucesso");
        }
        else{
            System.out.println("Não existe nenhuma conta");
        }
    }
    
    public float sacar(float value){
       if(status==true){
            if(saldo<value){
                System.out.println("Não foi possível sacar o dinheiro, pois seu saldo está abaixo");
                return 0.0f;
            } 
            else{
                saldo = saldo - value;
                System.out.println("Parabéns, foi possível realizar o saque");
                return value;
            }
       }else{
            System.out.println("Não existe uma conta para sacar");
            return 0.0f;
       }
    }
    
    public void pagarMensal(){
        if(status==true){
            if("CC".equals(tipo)){
                if(saldo>12){
                    setSaldo(saldo-12);
                    System.out.println("Sua mensalidade foi paga");
                }
                else{
                    System.out.println("Não tem saldo suficiente ");
                }
            }
            else{
                if(saldo>20){
                    setSaldo(saldo-20);
                    System.out.println("Sua mensalidade foi paga");
                }
                else{
                    System.out.println("Não tem saldo suficiente ");
                }
            }
        }
        else{
            System.out.println("Não existe uma conta para pagar a mensalidade");
        }
    }
}
