package ex9;

import java.util.ArrayList;
import java.util.List;

public class Diario {
    private int codigo;
    private String disciplina;
    private String professor;
    private int qtdeMaximaAlunos;
    private List<Aluno> alunos = new ArrayList();
    
    Diario(int codigo, String disciplina, String professor, int qtdeMaximaAlunos){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.qtdeMaximaAlunos = qtdeMaximaAlunos;
    }



    public void setQtdeMaximaAlunos(int qtdeMaximaAlunos){
        this.qtdeMaximaAlunos = qtdeMaximaAlunos; 
    }
    public int getQtdeMaximaAlunos() {
        return qtdeMaximaAlunos;
    }
    
    
    boolean incluirAluno(Aluno a){
        if(alunos.size()<=this.qtdeMaximaAlunos){
            alunos.add(a);
            return true;
        }else{
            return false;
        }
    }
    boolean contem(Aluno a){
        return alunos.contains(a);
    }
    
    int getTotalAlunosMatriculados(){
        return alunos.size();
    }
    void listarAlunos(){
        for(Aluno al: alunos){
            al.imprimir();
        }
    }
}
