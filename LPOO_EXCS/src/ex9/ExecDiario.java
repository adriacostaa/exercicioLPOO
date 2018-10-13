package ex9;
import java.util.Scanner;

public class ExecDiario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Diario diario = new Diario(001, "ATP", "Joao", 5);
        Aluno aluno = new Aluno();
        int mat,codigo;
        String nome;
        
        
        //inserir alunos
        for (int i=0;i<diario.getQtdeMaximaAlunos();i++){
            codigo = i+1;
            aluno.setCodigo(codigo);
            System.out.println("Matrícula: ");
            mat = in.nextInt();
            aluno.setMatricula(mat);
            System.out.println("Nome: ");
            nome = in.next();
            aluno.setNome(nome);
            diario.incluirAluno(aluno);           
        }
        diario.listarAlunos();
    }
}
