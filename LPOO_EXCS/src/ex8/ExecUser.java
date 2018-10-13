/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;


public class ExecUser {
    public static void main(String[] args) {
        
        User u = new User(123333, "joao");
        
        u.adicionarAmigos("jose");
        u.adicionarAmigos("zose");
        u.adicionarAmigos("aose");
        u.adicionarAmigos("hose");
        
        u.listarAmigos();
        u.ordenar();
        
        u.listarAmigos();
        
        
    }
}
