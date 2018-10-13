
package ex3;
import java.util.Scanner;

public class ExecConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conta c = new Conta(5000);
        String cliente;
        int op, numConta;
        double valor;
        
        System.out.println("**CONTA**");
        System.out.print("Nome: ");
        cliente = in.next();
        c.setCliente(cliente);
        
        System.out.print("Número de Conta: ");
        numConta = in.nextInt();
        c.setNum(numConta);
        do{
            System.out.println("1.Sacar\n2.Depositar\n0.Sair");
            op = in.nextInt();
            switch(op){
                case 1: 
                    System.out.print("Sacar\nValor: ");
                    valor = in.nextDouble();
                    c.sacar(valor);
                    break;
                case 2:
                    System.out.print("Depositar\nValor: ");
                    valor = in.nextDouble();
                    c.depositar(valor);
                    break;
                case 0:
                    break; 
            }
            System.out.println("Continuar?\n1.Sim\n0.Não\n");
            op = in.nextInt();
            
        }while(op!=0);
    }
}
