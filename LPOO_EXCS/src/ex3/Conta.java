
package ex3;


public class Conta {
    private int num;
    private String cliente;
    private double saldo;
    private double limite;
    Conta(){}
    Conta(double saldo){
        this.saldo = saldo;
    }//construtor
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    
    boolean sacar(double valor){
        if(valor<=this.saldo){
            System.out.println("Realizado!");
            return true; 
        }else{
            System.out.println("Não Realizado por falta de saldo!");
            return false;
        }
    }
    
    boolean depositar(double valor){
        if(valor>0){
            
            System.out.println("Realizado!");
            return true;
        }else{
            System.out.println("Não Realizado, insira um valor!");
            return false;
        }
    }
    
}
