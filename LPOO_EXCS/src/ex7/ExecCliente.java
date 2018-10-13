
package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExecCliente {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <Cliente> listaCliente = new ArrayList();
        int op, cpfCliente;
        String nomeCliente;

        do{
            System.out.println("NOVO CLIENTE");
            System.out.println("Cpf do Cliente: ");
            cpfCliente = in.nextInt();
            System.out.println("Nome do Cliente: ");
            nomeCliente = in.next();
            
            listaCliente.add(new Cliente(cpfCliente,nomeCliente));
            
            System.out.println("Adicionar novo cliente? 1.Sim 0.Não");
            op = in.nextInt();
        }while(op!=0);
          
        System.out.println("Quantidade de clientes: "+listaCliente.size());
        
        for(Cliente cli : listaCliente){
            System.out.println("CPF: "+cli.getCpf()+" Nome: "+cli.getNome());
        }
    }
}
