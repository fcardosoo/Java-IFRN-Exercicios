/*
 buscando palavras ou trechos em uma string
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = leitor.next();
        if(nome.length()>=4 &&
        nome.substring(0,4).equalsIgnoreCase("Joao")){
            System.out.println("Olá João!");    
        }else{
            System.out.println("Epa, você não é João!");
        }
    }
   
}
