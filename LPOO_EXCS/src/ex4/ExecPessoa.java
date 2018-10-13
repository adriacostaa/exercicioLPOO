
package ex4;


import java.util.Scanner;

import java.util.Calendar;

public class ExecPessoa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        
        Pessoa p = new Pessoa();//("Jurandir", 1999);
        
        
        String nome;
        int anoN;
        
        p.setNome(nome = in.next());
        anoN = in.nextInt();
        p.setDataNascimento(anoN);
        
        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.calcularIdade(anoAtual));
        
        
    }
}
