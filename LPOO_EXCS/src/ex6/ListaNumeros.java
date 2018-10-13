
package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListaNumeros {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList();
        Scanner in = new Scanner(System.in);
        
        int valor, qtd=0, soma=0;
        
        System.out.print("Valor: ");
        do{
            valor = in.nextInt();
            lista.add(valor);
            
        }while(valor!=0);
        
        System.out.println("");lista.size();
       
        //mostrar itens da lista
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            soma += lista.get(i);
        }
    }
}
