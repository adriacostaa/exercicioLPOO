
package ex1;

import java.util.Scanner;

public class ExecRetangulo {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Retangulo r = new Retangulo();
       
       System.out.println("Calculo da area de um retangulo");
        System.out.print("Base: ");
        double base=in.nextDouble();
        r.setBase(base);
        System.out.print("Altura: ");
        double altura=in.nextDouble();
        r.setAltura(altura);
        
        System.out.println("Area= "+r.calculoArea());
    }
}
