
package ex5;


public class Usuario {
    private int codigo;
    private String nome;
    private String[] amigos;
    
    Usuario(){}
    public Usuario(int codigo, String nome, String[] amigo){
        this.codigo = codigo;
        this.nome = nome;
        this.amigos = amigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getAmigos() {
        return amigos;
    }

    public void setAmigos(String[] amigos) {
        this.amigos = amigos;
    }
    
    //metodos    
     public boolean possuiAmigo(String nome){
       for(int i=0;i < amigos.length;i++){
           if(amigos[i].equals("")){
               amigos[i]=nome;
               return true;
           }
       }//fim for
        return false;
       
        
    }//fim metodo
    
    public boolean adicionaAmigo(String amigo){
         if(!possuiAmigo(nome)){
            for (int i = 0; i < amigos.length; i++) {
                if(amigos[i] == null  || amigos[i].equals("")){
                    amigos[i] = nome;
                    return true;
                }
            }
        }
        return false;
    }//fim metodo
}

