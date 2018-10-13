
package ex8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User>{
    private long cpf;
    private String nome;
    private List<String> amigos = new ArrayList<>();
    
    public User(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome+"Cpf: "+this.cpf); 
    }
    
    public boolean adicionarAmigos(String nome){
        this.amigos.add(nome);
        return true;
    }
    
    public boolean possuiAmigos(String nome){
        return this.amigos.contains(nome);
    }
    public void listarAmigos(){
        for(String a : amigos){
            System.out.println(a);
        }
        
    }
    public void ordenar(){
        Collections.sort(amigos);
    }

    @Override
    public int compareTo(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
