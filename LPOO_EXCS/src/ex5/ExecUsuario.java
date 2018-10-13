
package ex5; //ESSE NAO É O EXERCICIO 5
import java.util.Scanner;

public class ExecUsuario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de usuarios: ");
        int qtde =in.nextInt();
        Usuario[] listaUsuarios = new Usuario[qtde];
        
        
        for(int i=0; i < listaUsuarios.length;i++){
            System.out.println("USUARIO");
            System.out.println("Informe o codigo");
            int codigo = in.nextInt();
            System.out.println("nome: ");
            String nome = in.next();
            System.out.println("quantidade de amigos: ");
            qtde = in.nextInt();
            
            // a cada loop um objeto é criado e adicionado no vetor
            String[] amigos = new String[qtde];
            
            System.out.println("Nome dos amigos: ");
            for(int j=0;j<qtde;j++){
                String nomeAmigo = in.next();
                amigos[j] = nomeAmigo;
            }
            
            Usuario user = new Usuario(codigo, nome, amigos);
            //adiciona objeto na posicao do vetor
            listaUsuarios[i] = user;
        
            
        }//fimfor
        
        //mostrar o que foi inserido
        for(Usuario usuario : listaUsuarios){
            System.out.println("Usuario: "+ usuario.getNome()); //mostra o usuario
            System.out.println("Amigos"); //amigos dos usuarios
            for(String amigo : usuario.getAmigos()){
                System.out.println(" - "+amigo);
            }
        }
        
        
        
    }
}
