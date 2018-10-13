
package ex9;

public class Aluno {
    private int codigo;
    private int matricula;
    private String nome;

    Aluno(){}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Matricula: "+this.getMatricula()+" Nome: "+ this.getNome());
        
    }
    //sobrescreve o metodo equals generico
    //o metodo contem utilizara esse metodo para fazer a comparaçao
    @Override
    public boolean equals(Object obj){
       Aluno aluno = (Aluno) obj;
       return this.nome.equals(aluno.nome);
   } 
    
}
