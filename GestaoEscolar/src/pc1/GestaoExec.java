
package pc1;

import java.util.Scanner;
import java.util.Random;

public class GestaoExec {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rdm = new Random();
        int qtdAluno=3, qtdProf=3;
        Aluno[] ca = new Aluno[qtdAluno];
        Professor[] cp = new Professor[qtdProf];
        Disciplina d = new Disciplina();
        int j=0,i=0,op=1;
            
         while(j<qtdProf){  
           Professor prof= new Professor(); //a cada loop criará um objeto novo
           
           System.out.println("** CADASTRO PROFESSOR**");
           //System.out.println("Matricula do Professor: ");
           prof.matProf = rdm.nextInt();
           System.out.println("Nome do Professor: ");
           prof.nomeProf = in.next();
           System.out.println("Disciplina: ");
           prof.disciplina = in.next();
           cp[j] = prof;
           j++;
         }
           
        while(i<qtdAluno){
            Aluno aln = new Aluno();
            System.out.println("** CADASTRO ALUNO**");
            aln.matricula = rdm.nextInt();
            System.out.println("Nome do Aluno: ");
            aln.nome = in.next();
            System.out.println("Turma: ");
            aln.turma = in.next();
            
            ca[i]= aln;
            i++;
            System.out.println("Continuar cadastrando?\n1.sim\n0.nao");
            op=in.nextInt();
            if(op==0){
               break;
            }
            
        }//fim while   
           Curso c = new Curso();
           c.codigo= rdm.nextInt();
           System.out.println("Nome do curso:");
           c.nome= in.next();
         
           //saída na tela
          System.out.println("**CURSO**");
          System.out.println("Codigo: "+c.codigo);
          System.out.println("Nome: "+c.nome);
          System.out.println("PROFESSORES: ");
          for(i=0;i<cp.length;i++){  
            System.out.print("Matricula: "+cp[i].matProf);
            System.out.print("\tNome do Professor: "+cp[i].nomeProf);
            System.out.print("\tDisciplina: "+cp[i].disciplina);
          }
          System.out.println("ALUNOS: ");
          for(i=0;i<ca.length;i++){
            System.out.print("Matricula: "+ca[i].matricula);
            System.out.print("\tNome do Aluno: "+ca[i].nome);
            System.out.print("\tDisciplina: "+ca[i].turma);
          }  
    }
}
