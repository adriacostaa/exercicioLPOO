
package ex2;


public class Operacao {
    private double valor1;
    private double valor2;
    
    Operacao(){} // construtor

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    
    public double somar(){
        double soma = (this.valor1 + this.valor2);
        return soma;
    }
    public double subtrair(){
        double subtrair = (this.valor1 - this.valor2);
        return subtrair;
    }
    
    public double multiplicar(){
        double mult = (this.valor1 * this.valor2);
        return mult;
    }
    public double dividir(){
        double div = (this.valor1 / this.valor2);
        return div;
    }
}
