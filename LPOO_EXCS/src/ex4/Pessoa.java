
package ex4;

/*REFAZER*/

public class Pessoa {
    private String nome;
    private int idade;
    private int dataNascimento;
    
    /*Pessoa(String nome, int dataNasc){
        this.nome = nome;
        this.dataNascimento = dataNasc;
    }; //construtor
    */
    
    Pessoa(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
       
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }
    
    int calcularIdade(int anoAtual){
        return this.idade = anoAtual - this.dataNascimento;        
    }
}
