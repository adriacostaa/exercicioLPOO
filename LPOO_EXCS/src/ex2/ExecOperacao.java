
package ex2;

import java.util.Scanner;

public class ExecOperacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operacao o = new Operacao();
        double v1,v2;
       
        System.out.println("**OPERACAO**");
        System.out.print("1o Valor: ");
        v1 = in.nextDouble();
        o.setValor1(v1);
        
        System.out.print("2o Valor: ");
        v2 = in.nextDouble();
        o.setValor2(v2);
        
        System.out.println("\nRESULTADOS\nSoma: " + o.somar());
        System.out.println("Subtração: " + o.subtrair());
        System.out.println("Multiplicação: " + o.multiplicar());
        System.out.println("Divisão: " + o.dividir());
    }
}
